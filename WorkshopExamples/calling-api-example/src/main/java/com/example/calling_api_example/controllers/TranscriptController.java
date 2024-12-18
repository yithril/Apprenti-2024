package com.example.calling_api_example.controllers;

import com.example.calling_api_example.dto.CustomerServiceEvaluation;
import com.example.calling_api_example.dto.TranscriptDto;
import com.example.calling_api_example.entity.Transcript;
import com.example.calling_api_example.services.ChatGptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/transcript")
public class TranscriptController {

    @Autowired
    private ChatGptService chatGptService;

    @PostMapping
    public Mono<ResponseEntity<CustomerServiceEvaluation>> createTranscript(@RequestBody TranscriptDto dto) {
        return chatGptService.getResponse(dto.getTranscript())
                .map(evaluation -> ResponseEntity.ok(evaluation));
    }
}
