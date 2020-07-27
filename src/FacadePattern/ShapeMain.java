package FacadePattern;

/**
 * @description:
 * @author: wwh
 * @create: 2020/7/24
 */
public class ShapeMain {
    public static void main(String[] args) {

        ShapeMaker shapeMaker = new  ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
