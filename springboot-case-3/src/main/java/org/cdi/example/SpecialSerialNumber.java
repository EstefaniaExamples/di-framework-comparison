package org.cdi.example;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service("specialSerialNumber")
public class SpecialSerialNumber implements SerialNumber {
    @Override
    public String generateSerialNumber() {
        return "10-" + Math.abs(new Random().nextInt());
    }
}
