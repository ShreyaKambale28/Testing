package com.example.assignment2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chatbot")
public class ChatbotController {
	@Autowired
    private ChatbotService chatbotService;

    @PostMapping("/ask")
    public ResponseEntity<String> getAnswer(@RequestBody String question) {
        String answer = chatbotService.getAnswer(question);
        if (answer != null) {
            return ResponseEntity.ok(answer);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No answer found.");
        }
    }
}
