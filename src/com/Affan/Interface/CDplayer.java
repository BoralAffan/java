package com.Affan.Interface;

public class CDplayer implements Media{
    @Override
    public void start() {
        System.out.println("start the music");
    }

    @Override
    public void stop() {
        System.out.println("stoop the music");
    }
}
