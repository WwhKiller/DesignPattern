package BuilderPattern.Burger;

/**
 * @description:
 * @author: wwh
 * @create: 2020/6/23
 */
public class VegBurger extends Burger {

    @Override
    public String Name() {
        return "VegBurger";
    }

    @Override
    public float price() {
        return (float) 6.00;
    }
}
