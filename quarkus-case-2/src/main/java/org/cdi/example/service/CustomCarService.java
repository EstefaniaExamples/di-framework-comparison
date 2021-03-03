package org.cdi.example.service;

import org.cdi.example.SerialNumber;
import org.cdi.example.model.Car;
import org.cdi.example.qualifiers.ShortSerialNumber;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class CustomCarService {
    @Inject
    @ShortSerialNumber
    SerialNumber serialNumber;

    public Car createNewCar(final String brand, final String model, final String colour) {
        final Car car = new Car(brand, model, colour);
        car.setSerialNumber(serialNumber.generateSerialNumber());
        return car;
    }
}
