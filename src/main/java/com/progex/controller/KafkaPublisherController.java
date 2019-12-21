package com.progex.controller;

import com.progex.service.MessageAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaPublisherController {

    @Autowired
    private MessageAdapter messageService;

    @RequestMapping(value = "/sendMessage", method = RequestMethod.POST)
    public String publishMessageString(@RequestBody String payload) {
        messageService.sendMessage(payload);
        return "success";
    }
}