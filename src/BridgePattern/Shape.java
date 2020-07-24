package BridgePattern;

/**
 * @description:
 * @author: wwh
 * @create: 2020/7/7
 */
public abstract class Shape {

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;

    }



    public abstract void draw();
}
