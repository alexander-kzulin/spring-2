package by.kazuilin.spring;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component("Rock")
public class RockMusic implements Music {
    Random random = new Random();
    @Override
    public String getSong() {
        String[] rockSongs = {"When we stands together", "Layla", "Rape me"};
        int randomSong = random.nextInt(rockSongs.length);
        return rockSongs[randomSong];
    }
}
