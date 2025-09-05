package com.github.alexander.spring.framework.controller;

import org.springframework.stereotype.Controller;

/// @Controller is annotation that can annotate classic controllers with the @Controller annotation.

@Controller
public class TestController {

    public String hello(){
        return "hello Controller";
    }
}
