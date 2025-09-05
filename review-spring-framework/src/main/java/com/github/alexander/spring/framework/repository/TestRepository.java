package com.github.alexander.spring.framework.repository;

import org.springframework.stereotype.Repository;

/// @Repository is annotation that annotates classes at the persistence layer, which will act as a database repository.

@Repository
public class TestRepository {

    public String hello(){
        return "hello repository";
    }
}
