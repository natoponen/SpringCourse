package org.example.springCourse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class RockMusic implements Music{
    @Value("${rockMusic.duration}")
    private int duration;
    ArrayList<String> songList = new ArrayList<>(Arrays.asList("Wind Cries Mary", "Hotel California", "Highway To Hell"));
    @Override
    public String getSong(int num) {
        return songList.get(num);
    }

    @Override
    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public int getDuration() {
        return duration;
    }
}
