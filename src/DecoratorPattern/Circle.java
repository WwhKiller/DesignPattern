package DecoratorPattern;

/**
 * @description:
 * @author: wwh
 * @create: 2020/7/28
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("左手画了一个圆");
    }
}
