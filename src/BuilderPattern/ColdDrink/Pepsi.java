package BuilderPattern.ColdDrink;

/**
 * @description:
 * @author: wwh
 * @create: 2020/6/23
 */
public class Pepsi extends ColdDrink {
    @Override
    public String Name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return (float) 3.00;
    }
}
