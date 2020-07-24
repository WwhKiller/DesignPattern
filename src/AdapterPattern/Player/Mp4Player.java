package AdapterPattern.Player;

/**
 * @description:
 * @author: wwh
 * @create: 2020/7/1
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("播放MP4...");
    }
}
