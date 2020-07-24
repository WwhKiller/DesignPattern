package AdapterPattern.Player;

/**
 * @description:
 * @author: wwh
 * @create: 2020/7/1
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("播放Vlc...");
    }

    @Override
    public void playMp4(String fileName) {

    }
}
