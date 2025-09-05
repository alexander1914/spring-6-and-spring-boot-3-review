package com.github.alexander.spring.framework.service;

import org.springframework.stereotype.Service;

/// @Service is annotation that annotates classes at the service layer.

@Service
public class TestService {

    public String hello(){
        return "hello Service";
    }
}
