package BridgePattern;

/**
 * @description:
 * @author: wwh
 * @create: 2020/7/7
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new CirCle(100,100, 10, new RedCircle());
        Shape greenCircle = new CirCle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
