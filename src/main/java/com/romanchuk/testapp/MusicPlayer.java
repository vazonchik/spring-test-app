package com.romanchuk.testapp;

public class MusicPlayer {
    public void setMusic(Music music) {
        this.music = music;
    }

    private Music music;

    public MusicPlayer(Music music){
        this.music = music;
    }



    public void playMusic(){
        System.out.println("Playing: " + music.getSong());
    }
}
