package DecoratorPattern;

/**
 * @description:
 * @author: wwh
 * @create: 2020/7/28
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("右手画了一个方");
    }
}
