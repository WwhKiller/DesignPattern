package ObserverPattern.SpcialObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 行动者
 * @author: wwh
 * @create: 2020/9/22
 */
public class Action {

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){
        this.observers.add(observer);
    }

    void  doAction(){
        System.out.println("我开始做事了哦。快来发现我");
        notifyAllObservers();
    }

    public  void notifyAllObservers(){
        for (Observer observer : observers){
            observer.OBAction();
        }
    }
}
