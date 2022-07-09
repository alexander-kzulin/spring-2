package by.kazuilin.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("Classic")
//@Scope("prototype")
public class ClassicalMusic implements Music {
@PostConstruct()
    public void diMyInit(){
        System.out.println("Initialisation...");
    }

    @PreDestroy
            public void doMyDestroy() {
        System.out.println("Destroying... ");
    }
    Random random = new Random();
    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        String[] classicSongs = {"Hungarian Rhapsody", "Sonata No5", "Fur Elise"};
       int randomSong = random.nextInt(classicSongs.length);
        return classicSongs[randomSong];
    }
}
