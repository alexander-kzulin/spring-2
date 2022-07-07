package by.kazuilin.spring;

import org.springframework.stereotype.Component;

@Component("Rock")
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "When we stand together";
    }
}
