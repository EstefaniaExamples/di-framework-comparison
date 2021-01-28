package org.cdi.example;

public class GreetingService {
    private final String message;

    public GreetingService(final String message) {
        this.message = message;
    }

    public String sayHello(String name) {
        return message + " " + name;
    }
}
