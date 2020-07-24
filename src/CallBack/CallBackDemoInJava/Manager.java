package CallBack.CallBackDemoInJava;

/**
 * @description:
 * @author: wwh
 * @create: 2020/7/11
 */
public class Manager {
    public Manager(Personnel personnel){
        personnel.doSomething(this,"整理公司文件");
    }

    public void phoneCall(String result){
        System.out.println("事情："+result);
    }
}
