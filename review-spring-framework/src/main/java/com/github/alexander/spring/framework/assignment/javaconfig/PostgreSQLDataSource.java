package com.github.alexander.spring.framework.assignment.javaconfig;

public class PostgreSQLDataSource implements DataSource{
    @Override
    public String[] getEmails() {

        String[] emails = {"alexander.oliveira99pt@gmail.com", "alexander.oliveira99@gmail.com"};

        return emails;
    }
}
