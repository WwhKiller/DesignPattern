package FactoryPattern.Logger;

/**
 * @description:
 * @author: wwh
 * @create: 2020/6/16
 */
public class LoggerMain {
    public static void main(String[] args) {
        LoggerFactory loggerFactory = new LoggerFactory();

        //从工厂中获取本地磁盘记录的日志
        Logger localDiskLog  =  loggerFactory.getLogger("localDiskLog");
        localDiskLog.LogRecord();

        //从工厂中获取远程服务器记录的日志
        Logger remoteServerLog = loggerFactory.getLogger("remoteServerLog");
        remoteServerLog.LogRecord();

        //从工厂中获取系统事件记录的日志
        Logger systemEventsLog =  loggerFactory.getLogger("systemEventsLog");
        systemEventsLog.LogRecord();

    }
}
