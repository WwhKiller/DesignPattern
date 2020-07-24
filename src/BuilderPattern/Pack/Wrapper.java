package BuilderPattern.Pack;

/**
 * @description:
 * @author: wwh
 * @create: 2020/6/23
 */
public class Wrapper implements Packing {
    @Override
    public String pack() {
        System.out.println("用纸包！！！");
        return "use wrapper";
    }
}
