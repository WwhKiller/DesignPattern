package PrototypePattern;

/**
 * @description:
 * @author: wwh
 * @create: 2020/7/3
 */
public class Circle extends Shape {



    public Circle(){
        type = "Circle";
    }
    @Override
    void draw() {
        System.out.println("执行了Circle里面的draw方法");
    }
}
