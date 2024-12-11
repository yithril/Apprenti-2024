package com.example.calling_api_example;

import com.example.calling_api_example.services.ChatGptService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ChatGptTest {
    @Autowired
    private ChatGptService chatGptService;

    @Test
    public void callChatGpt(){
        var response = this.chatGptService.getResponse("Customer: My internet is not working.\nRep: I'm sorry to hear that. Let me help you troubleshoot.");

        Assertions.assertNotNull(response);
    }
}
