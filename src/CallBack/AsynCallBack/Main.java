package CallBack.AsynCallBack;

/**
 * @description:
 * @author: wwh
 * @create: 2020/7/11
 */
public class Main {

    public static void main(String[] args) {
        B b = new B();
        A a = new A(b);
        a.ask("1=1等于几啊？");
    }
}
