package com.kurszeit.chat.controller;

import com.kurszeit.chat.model.Message;
import com.kurszeit.chat.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @PostMapping("/send")
    public Message sendMessage(@RequestBody Message message) {
        return messageService.sendMessage(message);
    }

    @GetMapping("/history")
    public List<Message> getChatHistory(@RequestParam Long senderId, @RequestParam Long receiverId) {
        return messageService.getChatHistory(senderId, receiverId);
    }
}
