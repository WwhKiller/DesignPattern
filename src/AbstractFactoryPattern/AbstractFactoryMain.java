package AbstractFactoryPattern;

import AbstractFactoryPattern.DatabaseManagment.DataBase;
import AbstractFactoryPattern.Logger.Logger;


/**
 * @description:
 * @author: wwh
 * @create: 2020/6/16
 */
public class AbstractFactoryMain {
    public static void main(String[] args) {
        AbstractFactor databaseFactory = FactoryProducer.getAbstractFactor("database");
        DataBase database =  databaseFactory.getDataBase("MySQL");
        database.getDatabaseConnection();

        AbstractFactor loggerFactory = FactoryProducer.getAbstractFactor("logger");
        Logger localDiskLogger = loggerFactory.getLogger("localdisklog");
        localDiskLogger.LogRecord();
    }
}
