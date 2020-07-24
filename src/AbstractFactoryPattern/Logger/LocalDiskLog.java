package AbstractFactoryPattern.Logger;

/**
 * @description:
 * @author: wwh
 * @create: 2020/6/16
 */
public class LocalDiskLog implements Logger {
    @Override
    public void LogRecord() {
        System.out.println("用本地磁盘记录日志！！！");
    }
}
