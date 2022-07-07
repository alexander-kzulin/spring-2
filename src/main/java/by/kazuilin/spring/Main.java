package by.kazuilin.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        Music music = context.getBean("musicBean1", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();



        context.close();
    }
    }

