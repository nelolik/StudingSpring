package com.nelolik.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Timer;


public class MusicPlayer {
    private List<Music> musics;

    public MusicPlayer(List<Music> musicList) {
        this.musics = musicList;
    }

    public MusicPlayer() {
    }

    public String playMusic() {
        Random random = new Random(System.currentTimeMillis());
        int element = random.nextInt(3);
        return "Playing: " + musics.get(element).getSong();
    }

}
