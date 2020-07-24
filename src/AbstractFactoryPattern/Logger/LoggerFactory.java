package AbstractFactoryPattern.Logger;

import AbstractFactoryPattern.AbstractFactor;
import AbstractFactoryPattern.DatabaseManagment.DataBase;

/**
 * @description:
 * @author: wwh
 * @create: 2020/6/16
 */
public class LoggerFactory extends AbstractFactor {

    @Override
    public DataBase getDataBase(String dataBase) {
        return null;
    }

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
