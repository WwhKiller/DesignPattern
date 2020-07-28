package DecoratorPattern;

/**
 * @description:
 * @author: wwh
 * @create: 2020/7/28
 */
public abstract class ShapeDecorator {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
