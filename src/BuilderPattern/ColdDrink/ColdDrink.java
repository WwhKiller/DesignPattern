package BuilderPattern.ColdDrink;

import BuilderPattern.Item;
import BuilderPattern.Pack.Packing;
import BuilderPattern.Pack.Bottle;

/**
 * @description:
 * @author: wwh
 * @create: 2020/6/23
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();

}
