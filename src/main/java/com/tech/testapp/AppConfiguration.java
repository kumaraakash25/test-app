package com.tech.testapp;

import com.tech.sharedapp.service.PreProcessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class AppConfiguration {

    @Autowired
    PreProcessorService preProcessorService;

    @PostConstruct
    public void initialiseAudit() {
        preProcessorService.initialiseAudit();
    }

}
