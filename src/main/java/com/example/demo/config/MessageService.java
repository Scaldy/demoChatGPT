package com.example.demo.config;

public class MessageService {
    private final String baseMessage;

    public MessageService(String baseMessage) {
        this.baseMessage = baseMessage;
    }

    public String getMessage() {
        return baseMessage;
    }
}
