package com.github.alexander.spring.framework.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

    /// Injection Dependency with my services
    /// This way the most important to work OOP with an interface
    /// final is word reserved of java to restrict the user

    @Autowired
    @Qualifier("emailService")
    private final MessageService messageService;

    @Autowired
    public MessageSender(@Qualifier("emailService") MessageService messageService){
        this.messageService = messageService;
        System.out.println("Constructor based dependency injection ...");
    }

    @Autowired
    public void setMessageService(@Qualifier("emailService") MessageService messageService) {
        //this.messageService = messageService;
        System.out.println("Setter based dependency injection ...");
    }

    public void sendMessage(String message){
        this.messageService.sendMessage(message);
    }
}
