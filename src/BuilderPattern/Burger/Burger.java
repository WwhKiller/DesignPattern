package BuilderPattern.Burger;

import BuilderPattern.Item;
import BuilderPattern.Pack.Packing;
import BuilderPattern.Pack.Wrapper;

/**
 * @description:
 * @author: wwh
 * @create: 2020/6/23
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
