package com.mkyong.service;

import org.springframework.stereotype.Service;

/**
 * Service class for handling message operations
 * @author mkyong
 */
@Service
public class MessageService {
    
    private static final String DEFAULT_MESSAGE = "Hello from Spring MVC!";
    
    /**
     * Get a greeting message
     * @param name name to greet
     * @return personalized greeting message
     */
    public String getGreeting(String name) {
        if (name == null || name.trim().isEmpty()) {
            return DEFAULT_MESSAGE;
        }
        return "Hello " + name + "! Welcome to Spring MVC!";
    }
    
    /**
     * Get default message
     * @return default message
     */
    public String getDefaultMessage() {
        return DEFAULT_MESSAGE;
    }
    
    /**
     * Process message
     * @param input input message
     * @return processed message
     */
    public String processMessage(String input) {
        if (input == null) {
            return DEFAULT_MESSAGE;
        }
        return "Processed: " + input.toUpperCase();
    }
    
    /**
     * Validate message format
     * @param message message to validate
     * @return true if valid, false otherwise
     */
    public boolean isValidMessage(String message) {
        return message != null && message.length() > 0 && message.length() <= 100;
    }
}
