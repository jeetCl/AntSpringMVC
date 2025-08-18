package com.mkyong.test;

import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;
import static org.junit.Assert.*;

import com.mkyong.service.MessageService;
import com.mkyong.controller.HelloController;

/**
 * JUnit test class for testing message functionality
 * @author mkyong
 */
public class TestMessage {
    
    private MessageService messageService;
    private HelloController helloController;
    
    @Before
    public void setUp() {
        messageService = new MessageService();
        helloController = new HelloController();
    }
    
    /**
     * Test default message functionality
     */
    @Test
    public void testDefaultMessage() {
        String message = messageService.getDefaultMessage();
        assertNotNull("Default message should not be null", message);
        assertEquals("Hello from Spring MVC!", message);
    }
    
    /**
     * Test greeting functionality
     */
    @Test
    public void testGreeting() {
        String greeting = messageService.getGreeting("John");
        assertNotNull("Greeting should not be null", greeting);
        assertTrue("Greeting should contain name", greeting.contains("John"));
        assertEquals("Hello John! Welcome to Spring MVC!", greeting);
    }
    
    /**
     * Test greeting with null name
     */
    @Test
    public void testGreetingWithNullName() {
        String greeting = messageService.getGreeting(null);
        assertEquals("Hello from Spring MVC!", greeting);
    }
    
    /**
     * Test greeting with empty name
     */
    @Test
    public void testGreetingWithEmptyName() {
        String greeting = messageService.getGreeting("");
        assertEquals("Hello from Spring MVC!", greeting);
        
        greeting = messageService.getGreeting("   ");
        assertEquals("Hello from Spring MVC!", greeting);
    }
    
    /**
     * Test message processing
     */
    @Test
    public void testProcessMessage() {
        String processed = messageService.processMessage("hello world");
        assertEquals("Processed: HELLO WORLD", processed);
        
        processed = messageService.processMessage(null);
        assertEquals("Hello from Spring MVC!", processed);
    }
    
    /**
     * Test message validation
     */
    @Test
    public void testMessageValidation() {
        assertTrue("Valid message should pass", messageService.isValidMessage("Hello"));
        assertFalse("Null message should fail", messageService.isValidMessage(null));
        assertFalse("Empty message should fail", messageService.isValidMessage(""));
        
        // Test very long message (over 100 chars)
        String longMessage = "a".repeat(101);
        assertFalse("Long message should fail", messageService.isValidMessage(longMessage));
        
        // Test exactly 100 chars
        String maxMessage = "a".repeat(100);
        assertTrue("Max length message should pass", messageService.isValidMessage(maxMessage));
    }
    
    /**
     * Test controller welcome message
     */
    @Test
    public void testControllerWelcomeMessage() {
        String welcome = helloController.getWelcomeMessage();
        assertNotNull("Welcome message should not be null", welcome);
        assertEquals("Welcome to Spring MVC Framework!", welcome);
    }
}
