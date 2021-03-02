package main.design.Adapter;

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer = new MpPlayer();
        }
    }

    @Override
    public void play(String audioType, String fileName){
        if (audioType.equalsIgnoreCase("vlc"))
            advancedMusicPlayer.playMp4(fileName);
        else if (audioType.equalsIgnoreCase("mp4"))
            advancedMusicPlayer.playMp4(fileName);
    }

    }
