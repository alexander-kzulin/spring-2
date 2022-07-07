package by.kazuilin.spring;

import org.springframework.stereotype.Component;

@Component("Classic")
public class ClassicalMusic implements Music {
    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("doing my initialisation");
    }
    public void doMyDestroy(){
        System.out.println("doing destruction");
    }
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
