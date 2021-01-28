package org.cdi.example.springbootcase;

public class GreetingService {
    private final String message;

    public GreetingService(final String message) {
        this.message = message;
    }

    public String sayHello(final String name) {
        return message + " " + name;
    }
}
