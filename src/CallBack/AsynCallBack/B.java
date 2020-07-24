package CallBack.AsynCallBack;

/**
 * @description:
 * @author: wwh
 * @create: 2020/7/11
 */
public class B {
    void executeMessage(CallBack callBack, String qeustion) {

        System.out.println(callBack.getClass()+"问了B一个问题："+qeustion);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String  result  = "事情处理完成，答案是2";

        callBack.solve(result);
    }
}
