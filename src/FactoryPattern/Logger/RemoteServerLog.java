package FactoryPattern.Logger;

/**
 * @description:
 * @author: wwh
 * @create: 2020/6/16
 */
public class RemoteServerLog implements Logger{

    @Override
    public void LogRecord() {
        System.out.println("用远程服务器的方式来记录日志！！！");
    }
}
