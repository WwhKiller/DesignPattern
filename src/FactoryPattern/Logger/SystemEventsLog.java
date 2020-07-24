package FactoryPattern.Logger;

/**
 * @description:
 * @author: wwh
 * @create: 2020/6/16
 */
public class SystemEventsLog implements Logger {
    @Override
    public void LogRecord() {
        System.out.println("用系统事件记录日志！！！");
    }
}
