package main.design.Adapter;

public class AdaptPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","beyond the horzon");
        audioPlayer.play("mp4","alone.mp4");
        audioPlayer.play("vlc","alone.mp4");
        audioPlayer.play("avi","alone.mp4");

    }
}
