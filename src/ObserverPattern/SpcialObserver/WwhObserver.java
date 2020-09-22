package ObserverPattern.SpcialObserver;

/**
 * @description:
 * @author: wwh
 * @create: 2020/9/22
 */
public class WwhObserver extends Observer {

    public WwhObserver(Action action){
        this.action = action;
        this.action.addObserver(this);

    }
    @Override
    public void OBAction() {
        System.out.println("wwh 观察行动有变，并且采取其他行动");
    }
}
