package by.kazuilin.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
private String name;
    @Value("${musicPlayer.volume}")
private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    private Music music1;
    private Music music2;
    private Music music3;

    List<Music> musicList;

@Autowired
    public MusicPlayer(@Qualifier("Rock") Music music1, @Qualifier("Classic") Music music2, @Qualifier("Metal") Music music3) {
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
    }
    public MusicPlayer(List<Music> musicList) {
    this.musicList = musicList;
    }
//  @Autowired
    //  public MusicPlayer(Music music) {
    //      this.music = music;
    //  }


    //   public void playMusic() {
    //       System.out.println("Playing: " + music.getSong());
    //   }
    public String playMusic() {
        Random random = new Random();
        return "Now playing: " + musicList.get(random.nextInt(musicList.size())).getSong();
    }


}
