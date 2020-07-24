package PrototypePattern;

import java.util.Hashtable;

/**
 * @description:  一般从数据库中查询出来的数据，都会先存入缓存中，然后去缓存中查找，查找到以后clone出来提供使用，保存好原有的数据；
 * @author: wwh
 * @create: 2020/7/3
 */
public class ShapeCache {


    private static  Hashtable<String,Shape> shapeMap  = new Hashtable<String,Shape>();

    public static Shape getShape(String shapeId){

        Shape cachedShape  = shapeMap.get(shapeId);

        return (Shape) cachedShape .clone();
    }


    public static void loadCache() {

        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}
