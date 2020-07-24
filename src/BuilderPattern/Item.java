package BuilderPattern;

import BuilderPattern.Pack.Packing;

/**
 * @description:
 * @author: wwh
 * @create: 2020/6/23
 */
public interface Item {
    public String Name();
    public Packing packing();
    public float price();
}
