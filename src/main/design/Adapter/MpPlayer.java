package main.design.Adapter;

public class MpPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        //do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file.name:"+fileName);
    }
}
