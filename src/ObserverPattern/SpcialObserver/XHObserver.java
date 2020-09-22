package ObserverPattern.SpcialObserver;

/**
 * @description:
 * @author: wwh
 * @create: 2020/9/22
 */
public class XHObserver extends Observer{

    public XHObserver(Action action){
        this.action = action;
        this.action.addObserver(this);

    }
    @Override
    public void OBAction() {
        System.out.println("XH 观察到行动有变，并且采取了其他行动");
    }
}
