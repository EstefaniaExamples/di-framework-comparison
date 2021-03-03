package org.cdi.example;

import io.quarkus.test.junit.QuarkusTest;
import org.cdi.example.model.Car;
import org.cdi.example.service.CustomCarService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;


@QuarkusTest
public class CustomCarServiceTest {
    @Inject
    CustomCarService customCarService;

    @Test
    public void shouldCheckNumberIsThirteenDigits() {
        Car car = customCarService.createNewCar("Ford", "Coupe", "Grey");
        Assertions.assertTrue(car.getSerialNumber().startsWith("10-"));
    }
}
