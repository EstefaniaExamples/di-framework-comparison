package org.cdi.example;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.inject.Produces;
import javax.inject.Singleton;

@Singleton
public class GreetingServiceFactory {
    private final String message;

    public GreetingServiceFactory(@ConfigProperty(name="greeting.message", defaultValue = "Hello")
                                          final String message) {
        this.message = message;
    }

    @Singleton
    @Produces
    public GreetingService greetingService() {
        return new GreetingService(message);
    }
}
