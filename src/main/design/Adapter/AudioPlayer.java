package main.design.Adapter;

import java.lang.module.ModuleDescriptor;

public class AudioPlayer implements MediaPlayer {
   MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")){
            System.out.println("playing mp3");
        }else if (audioType.equalsIgnoreCase("vlc")||audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);
        }else{
            System.out.println("Invalid media"+audioType+"format not support");
        }

    }
}
