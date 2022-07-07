package by.kazuilin.spring;


import org.springframework.stereotype.Component;

import java.util.Random;

@Component("Metal")

public class MetalMusic implements Music {
    Random random = new Random();
    @Override
    public String getSong() {
        String[] metalSongs = {"Master of puppets", "Waisting love", "Through the fire and flames"};
        int randomSong = random.nextInt(metalSongs.length);
        return metalSongs[randomSong];
    }
}
