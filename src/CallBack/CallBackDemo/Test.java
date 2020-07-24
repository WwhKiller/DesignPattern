package CallBack.CallBackDemo;

/**
 * @description:
 * @author: wwh
 * @create: 2020/7/6
 */
public class Test {

    public static void main(String[] args) {

        Caller caller = new Caller();

        caller.setCallFunc(new Client());
        caller.call();
    }
}
