package BuilderPattern.Pack;

/**
 * @description:
 * @author: wwh
 * @create: 2020/6/23
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        System.out.println("用瓶装！！！");
        return "user bottle";
    }
}
