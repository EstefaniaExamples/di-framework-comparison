package org.cdi.example;

import org.cdi.example.qualifiers.ShortSerialNumber;

import javax.enterprise.context.ApplicationScoped;
import java.util.Random;

@ShortSerialNumber
@ApplicationScoped
public class SpecialSerialNumber implements SerialNumber {
    @Override
    public String generateSerialNumber() {
        return "10-" + Math.abs(new Random().nextInt());
    }
}
