package ua.art.springapp;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private Music music;
    private String name;
    private int volume;

    public MusicPlayer(Music music){
        this.music = music;
    }
    public MusicPlayer(){}


    public void playMusic(){
            System.out.println("Playing: "+ music.getSong());

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int value) {
        this.volume = value;
    }

    public void setMusic(Music music){ this.music = music; }


}
