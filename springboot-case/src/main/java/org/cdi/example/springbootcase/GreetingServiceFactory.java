package org.cdi.example.springbootcase;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class GreetingServiceFactory {
    private final String message;

    public GreetingServiceFactory(@Value("${hello.message:Hello}") String message) {
        this.message = message;
    }

    @Bean
    GreetingService greetingService() {
        return new GreetingService(message);
    }
}
