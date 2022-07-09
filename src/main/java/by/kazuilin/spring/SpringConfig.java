package by.kazuilin.spring;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan("by.kazuilin.spring")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    ClassicalMusic classicalMusic() { // зависимости вручную можно писать, но лучше чеез spring
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public MetalMusic metalMusic() {
        return new MetalMusic();
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }
    @Bean
    public List<Music> musicList() {
        return Arrays.asList(classicalMusic(), rockMusic(), metalMusic());
    }

}
