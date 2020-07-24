package PrototypePattern;

/**
 * @description:
 * @author: wwh
 * @create: 2020/7/3
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Rectangle 中的draw方法");
    }

}
