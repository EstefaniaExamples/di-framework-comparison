package org.cdi.example.service.sub;

import org.cdi.example.qualifiers.LongSerialNumber;

import javax.enterprise.context.ApplicationScoped;
import java.util.Random;

@LongSerialNumber
@ApplicationScoped
//@Default
public class CommonSerialImpl implements SerialNumber {
    @Override
    public String generateSerialNumber() {
        return "00-84356-" + Math.abs(new Random().nextInt());
    }
}
