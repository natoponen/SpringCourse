package org.example.springCourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    public enum Genre {CLASSICAL, ROCK}

    private List<? extends Music> genreList = new ArrayList<>();

    @Autowired
    public MusicPlayer(List<? extends Music> genreList) {
        this.genreList = genreList;
    }

    public void playMusic() {
        Random rnd = new Random();
        Music playingMusic = genreList.get(rnd.nextInt(3));
        System.out.println("Playing: "+playingMusic.getSong(rnd.nextInt(3))+" duration: "+playingMusic.getDuration());
    }
}
