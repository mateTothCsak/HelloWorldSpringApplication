package net.talkabot.assignment.controller;

import net.talkabot.assignment.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {


        @Autowired
        private MessageService messageService;


        @GetMapping("/")
        public String sayHello() {
            return messageService.getOneById(1).getText();
        }

}
