package CallBack.CallBackDemo;

/**
 * @description:
 * @author: wwh
 * @create: 2020/7/6
 */
public class Client implements MyCallInterface {
    @Override
    public void printName() {
        System.out.println("This is the client printName method");
    }
}
