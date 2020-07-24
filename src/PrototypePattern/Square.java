package PrototypePattern;

/**
 * @description:
 * @author: wwh
 * @create: 2020/7/3
 */
public class Square extends Shape{

    public Square(){
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("执行了Square中的draw方法");
    }
}
