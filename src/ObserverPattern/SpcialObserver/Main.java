package ObserverPattern.SpcialObserver;

import CallBack.AsynCallBack.A;

import java.beans.beancontext.BeanContext;

/**
 * @description:
 * @author: wwh
 * @create: 2020/9/22
 */
public class Main {
    public static void main(String[] args) {

        Action action = new Action();

        new WwhObserver(action);
        new XHObserver(action);

        action.doAction();
    }
}
