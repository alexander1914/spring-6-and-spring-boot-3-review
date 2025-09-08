package com.github.alexander.spring.framework.DI;

import org.springframework.stereotype.Component;

@Component
public class SMSService implements MessageService {

    /// @Override is annotation to rewrite of interface

    @Override
    public void sendMessage(String message){
        System.out.println(message);
    }
}
