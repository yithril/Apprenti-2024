package com.example.calling_api_example.services;

import com.example.calling_api_example.dto.CustomerServiceEvaluation;
import com.example.calling_api_example.request.ChatGptRequest;
import com.example.calling_api_example.response.ChatGptResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;

@Service
public class ChatGptService {
    private final WebClient webClient;
    private final String apiKey;

    public ChatGptService(WebClient.Builder webClientBuilder,
                          @Value("${openai.api.url}") String apiUrl,
                          @Value("${openai.api.key}") String apiKey) {
        this.webClient = webClientBuilder.baseUrl(apiUrl).build();
        this.apiKey = apiKey;
    }

    public Mono<CustomerServiceEvaluation> getResponse(String transcript) {
        // Prepare the messages
        var prompt = buildPrompt(transcript);

        var messages = List.of(
                Map.of("role", "system", "content", "You are a helpful assistant."),
                Map.of("role", "user", "content", prompt)
        );

        // Build the request
        var request = new ChatGptRequest("gpt-4o-mini", messages);

        // Send the API call
        return webClient.post()
                .header("Authorization", "Bearer " + apiKey)
                .header("Content-Type", "application/json")
                .bodyValue(request)
                .retrieve()
                .bodyToMono(String.class) // Get raw JSON for debugging
                .flatMap(rawResponse -> {
                    try {
                        // Step 1: Parse the outer response
                        ObjectMapper objectMapper = new ObjectMapper();
                        ChatGptResponse chatGptResponse = objectMapper.readValue(rawResponse, ChatGptResponse.class);

                        // Step 2: Extract and parse the nested JSON from "content"
                        String content = chatGptResponse.getChoices().get(0).getMessage().getContent();
                        CustomerServiceEvaluation evaluation = objectMapper.readValue(content, CustomerServiceEvaluation.class);

                        return Mono.just(evaluation);
                    } catch (Exception e) {
                        return Mono.error(new RuntimeException("Failed to parse ChatGPT response.", e));
                    }
                });
    }

    private String buildPrompt(String transcript) {
        StringBuilder promptBuilder = new StringBuilder();
        promptBuilder.append("You are an evaluator for customer service interactions. ")
                .append("I will provide you with a transcript of a phone call between a customer service representative and a customer.\n\n")
                .append("Analyze the transcript and return your evaluation in the following JSON format. ")
                .append("Ensure the JSON contains only the specified properties and no extra fields.\n\n")
                .append("{\n")
                .append("  \"level\": <rating from 1 (poor) to 5 (excellent)>,\n")
                .append("  \"summary\": [\n")
                .append("    \"First bullet point summarizing the representative's behavior.\",\n")
                .append("    \"Second bullet point summarizing the issue resolution.\",\n")
                .append("    \"Third bullet point suggesting any improvements.\"\n")
                .append("  ]\n")
                .append("}\n\n")
                .append("Here is the transcript:\n")
                .append(transcript); // Append the actual transcript dynamically

        return promptBuilder.toString();
    }
}
