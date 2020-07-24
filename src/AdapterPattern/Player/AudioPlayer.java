package AdapterPattern.Player;

/**
 * @description:
 * @author: wwh
 * @create: 2020/7/1
 */
public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String audioType, String fileName) {
        System.out.println("Audio播放...");
    }
}
