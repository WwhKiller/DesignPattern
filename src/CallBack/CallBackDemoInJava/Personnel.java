package CallBack.CallBackDemoInJava;

/**
 * @description:
 * @author: wwh
 * @create: 2020/7/11
 */
public class Personnel {

    public void doSomething(Manager manager ,String task){
        System.out.println("manager要你做的事情："+task);

        String result = "做完了";

        manager.phoneCall(result);
    }

}
