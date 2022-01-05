package com.nelolik.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class MusicPlayer {
//    @Autowired
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    public MusicPlayer() {
    }

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public String playMusic() {
        return "Playing: " + classicalMusic.getSong() + " " + "Playing: " + rockMusic.getSong();
    }

//    @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }

}
