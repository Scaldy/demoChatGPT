package com.example.demo.controller;

import com.example.demo.config.MessageService;
import com.example.demo.service.InfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    private final InfoService infoService;
    private final MessageService messageService;

    public AppController(InfoService infoService, MessageService messageService) {
        this.infoService = infoService;
        this.messageService = messageService;
    }

    @GetMapping("/info")
    public String info() {
        return infoService.getInfo() + " | " + messageService.getMessage();
    }
}
