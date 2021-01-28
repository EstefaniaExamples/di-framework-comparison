package org.cdi.example.springbootcase;

import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotBlank;

@RestController
@RequestMapping("/")
@Validated
public class GreetingController {
    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping(value = "/hello/{name}", produces = MediaType.TEXT_PLAIN_VALUE)
    String hello(@NotBlank String name) {
        return greetingService.sayHello(name);
    }
}
