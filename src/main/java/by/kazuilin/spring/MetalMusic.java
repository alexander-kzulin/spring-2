package by.kazuilin.spring;

import org.springframework.stereotype.Component;

@Component("2")
public class MetalMusic implements Music {
    @Override
    public String getSong() {
        return "Master of puppets";
    }
}