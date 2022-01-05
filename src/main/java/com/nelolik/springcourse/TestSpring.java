package com.nelolik.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music = context.getBean("rockMusic", RockMusic.class);
        Music music2 = context.getBean("classicalMusic", ClassicalMusic.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer classicalMusicPlayer = new MusicPlayer(music2);

        musicPlayer.playMusic();
        classicalMusicPlayer.playMusic();

        context.close();
    }
}
