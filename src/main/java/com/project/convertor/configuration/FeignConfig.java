package com.project.convertor.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import feign.Logger;

@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLeve(){
        return Logger.Level.FULL;
    }
}
