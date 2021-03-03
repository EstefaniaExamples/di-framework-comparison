package org.cdi.example.service;

import org.cdi.example.SerialNumber;
import org.cdi.example.model.Car;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CustomCarService {
    private final SerialNumber serialNumber;

    public CustomCarService(@Qualifier("specialSerialNumber") final SerialNumber serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Car createNewCar(final String brand, final String model, final String colour) {
        final Car car = new Car(brand, model, colour);
        car.setSerialNumber(serialNumber.generateSerialNumber());
        return car;
    }
}
