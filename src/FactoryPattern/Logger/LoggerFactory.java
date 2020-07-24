package FactoryPattern.Logger;

/**
 * @description:
 * @author: wwh
 * @create: 2020/6/16
 */
public class LoggerFactory {

    public Logger getLogger(String loggerWay){
        if (loggerWay == null){
            return null;
        }if (loggerWay.equalsIgnoreCase("localdisklog")){
            return new LocalDiskLog();
        }if (loggerWay.equalsIgnoreCase("remoteServerLog")){
            return new RemoteServerLog();
        }if (loggerWay.equalsIgnoreCase("systemeventslog")){
            return new SystemEventsLog();
        }
        return null;
    }
}
