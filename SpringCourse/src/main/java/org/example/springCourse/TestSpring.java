package org.example.springCourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        /*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );*/

        //Music music = context.getBean("musicBean", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);

       /* MusicPlayerDependencyViaConstructor musicPlayerDependencyViaConstructor = context.getBean("musicPlayerDependencyViaConstructor", MusicPlayerDependencyViaConstructor.class);
        musicPlayerDependencyViaConstructor.playMusic();

        MusicPlayerDependencyViaSetter musicPlayerDependencyViaSetter = context.getBean("musicPlayerDependencyViaSetter", MusicPlayerDependencyViaSetter.class);
        musicPlayerDependencyViaSetter.playMusic();*/

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();

        context.close();
    }
}
