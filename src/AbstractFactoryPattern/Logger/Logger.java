package AbstractFactoryPattern.Logger;

/**
 * @description: 日志记录器：记录可能记录到本地硬盘、系统事件、远程服务器等，用户可以选择记录日志到什么地方。
 * @author: wwh
 * @create: 2020/6/16
 */
public interface Logger {
    void LogRecord();
}
