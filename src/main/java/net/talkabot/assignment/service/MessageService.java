package net.talkabot.assignment.service;

import net.talkabot.assignment.model.Message;
import net.talkabot.assignment.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class MessageService {

    @Autowired
    MessageRepository messageRepository;

    public Message getOneById(int id){
        return this.messageRepository.findOneById(id);
    }
}
