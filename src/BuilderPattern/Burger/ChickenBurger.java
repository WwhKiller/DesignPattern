package BuilderPattern.Burger;

/**
 * @description:
 * @author: wwh
 * @create: 2020/6/23
 */
public class ChickenBurger extends Burger {

    @Override
    public String Name() {
        return "ChickenBurger";
    }

    @Override
    public float price() {
        return (float) 7.00;
    }
}
