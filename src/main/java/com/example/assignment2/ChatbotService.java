package com.example.assignment2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatbotService {
	@Autowired
	    private FAQRepository faqRepository;

	    // Make sure this method exists in the service
	    public String getAnswer(String question) {
	        // Fetch FAQs based on question
	        List<FAQ> faqs = faqRepository.findByQuestionContainingIgnoreCase(question);
	        
	        if (faqs.isEmpty()) {
	            return null; // No matching FAQ found
	        }
	        
	        // Return the first answer found
	        return faqs.get(0).getAnswer(); 
	    }
	}

