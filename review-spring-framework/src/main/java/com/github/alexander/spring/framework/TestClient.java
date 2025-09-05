package com.github.alexander.spring.framework;

import com.github.alexander.spring.framework.config.AppConfig;
import com.github.alexander.spring.framework.controller.TestController;
import com.github.alexander.spring.framework.repository.TestRepository;
import com.github.alexander.spring.framework.service.TestService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestClient {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        TestController testController = applicationContext.getBean(TestController.class);
        System.out.println(testController.hello());

        TestService testService = applicationContext.getBean(TestService.class);
        System.out.println(testService.hello());

        TestRepository testRepository = applicationContext.getBean(TestRepository.class);
        System.out.println(testRepository.hello());
    }
}