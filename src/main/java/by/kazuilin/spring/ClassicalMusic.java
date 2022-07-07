package by.kazuilin.spring;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component("Classic")
public class ClassicalMusic implements Music {
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
