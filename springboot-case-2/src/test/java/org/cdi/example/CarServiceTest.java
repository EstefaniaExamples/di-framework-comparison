package org.cdi.example;

import org.cdi.example.model.Car;
import org.cdi.example.service.CarService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CarServiceTest {
    @Autowired
    private CarService carService;

    @Test
    public void shouldCheckNumberIsThirteenDigits() {
        final Car car = carService.createNewCar("Ford", "Coupe", "Grey");
        Assertions.assertTrue(car.getSerialNumber().startsWith("00-84356-"));
    }
}
