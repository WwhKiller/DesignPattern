package ObserverPattern;

/**
 * @description:
 * @author: wwh
 * @create: 2020/7/27
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
