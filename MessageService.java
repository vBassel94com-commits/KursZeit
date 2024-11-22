package com.kurszeit.chat.service;

import com.kurszeit.chat.model.Message;
import com.kurszeit.chat.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public Message sendMessage(Message message) {
        message.setTimestamp(new Date());
        return messageRepository.save(message);
    }

    public List<Message> getChatHistory(Long senderId, Long receiverId) {
        return messageRepository.findBySenderIdAndReceiverId(senderId, receiverId);
    }
}
