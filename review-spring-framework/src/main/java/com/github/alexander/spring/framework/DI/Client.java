package com.github.alexander.spring.framework.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        String message = "Working with Dependency Injection ...";

        /*
        SMSService smsService = new SMSService();
        EmailService emailService = new EmailService();

        MessageSender messageSender = new MessageSender(smsService);
        messageSender.sendMessage(message);

        MessageSender messageSender2 = new MessageSender(emailService);
        messageSender2.sendMessage(message);
        */
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        MessageSender messageSender = applicationContext.getBean(MessageSender.class);
        messageSender.sendMessage(message);
    }
}
