package BuilderPattern.ColdDrink;

/**
 * @description:
 * @author: wwh
 * @create: 2020/6/23
 */
public class Coke extends ColdDrink {
    @Override
    public String Name() {
        return "Coke";
    }

    @Override
    public float price() {
        return (float) 3.50;
    }
}
