package by.kazuilin.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        // Music music = context.getBean("Classic", Music.class);
        // MusicPlayer musicPlayer = new MusicPlayer(music);
        // musicPlayer.playMusic();
        // Music music1 = context.getBean("Rock", Music.class);
        // MusicPlayer classicMusicPlayer = new MusicPlayer(music1);
        // classicMusicPlayer.playMusic();
        // Music music2 = context.getBean("Metal", Music.class);
        // MusicPlayer metalMusicPlayer = new MusicPlayer(music2);
        // metalMusicPlayer.playMusic();


        // MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        //  musicPlayer.playMusic();
        // Computer computer = context.getBean("computer", Computer.class);
        // System.out.println(computer);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.playMusic());


        context.close();
    }
}

