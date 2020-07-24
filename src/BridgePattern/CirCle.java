package BridgePattern;

/**
 * @description:
 * @author: wwh
 * @create: 2020/7/7
 */
public class CirCle extends Shape {
    private int x, y, radius;

    public CirCle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}