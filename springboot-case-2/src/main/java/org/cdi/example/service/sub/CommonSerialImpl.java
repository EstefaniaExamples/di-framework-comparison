package org.cdi.example.service.sub;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service("commonSerialImpl")
public class CommonSerialImpl implements SerialNumber {
    @Override
    public String generateSerialNumber() {
        return "00-84356-" + Math.abs(new Random().nextInt());
    }
}
