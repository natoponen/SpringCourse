package org.example.springCourse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;

@Component
public class RapMusic implements Music {
    @Value("${rapMusic.duration}")
    private int duration;
    ArrayList<String> songList = new ArrayList<>(Arrays.asList("Rap God", "Monster", "Mockingbird"));

    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong(int num) {
        return songList.get(num);
    };

    @Override
    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public int getDuration() {
        return duration;
    }
}
