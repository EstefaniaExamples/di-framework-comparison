package org.cdi.example;

import io.quarkus.test.junit.QuarkusTest;
import org.cdi.example.model.Car;
import org.cdi.example.service.CarService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

@QuarkusTest
public class CarServiceTest {
    @Inject
    CarService carService;

    @Test
    public void shouldCheckNumberIsThirteenDigits() {
        final Car car = carService.createNewCar("Ford", "Coupe", "Grey");
        Assertions.assertTrue(car.getSerialNumber().startsWith("00-84356-"));
    }
}
