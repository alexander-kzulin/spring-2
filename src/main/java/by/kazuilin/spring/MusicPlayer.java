package by.kazuilin.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private Music music;
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;


    //  @Autowired
    //  public MusicPlayer(Music music) {
    //      this.music = music;
    //  }
    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) { // второй вариант повесить две переменные
        // на одну зависимость
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    //   public void playMusic() {
    //       System.out.println("Playing: " + music.getSong());
    //   }
    public void playMusic() {
        System.out.println("Now playing: " + classicalMusic.getSong());
        System.out.println("Now playing: " + rockMusic.getSong());
    }



    @Override
    public String toString() {
        return  rockMusic.getSong() + " , " +  classicalMusic.getSong()
                ;
    }
}
