package CallBack.CallBackDemo;

/**
 * @description:
 * @author: wwh
 * @create: 2020/7/6
 */
public class Caller {

    private MyCallInterface callInterface;

    public Caller() {
    }

    public void setCallFunc(MyCallInterface callInterface) {
        this.callInterface = callInterface;
    }

    public void call() {
        callInterface.printName();
    }
}
