package org.cdi.example;

import org.cdi.example.model.Car;
import org.cdi.example.service.CustomCarService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CustomCarServiceTest {
    @Autowired
    private CustomCarService customCarService;

    @Test
    public void shouldCheckNumberIsThirteenDigits() {
        Car car = customCarService.createNewCar("Ford", "Coupe", "Grey");
        Assertions.assertTrue(car.getSerialNumber().startsWith("10-"));
    }
}
