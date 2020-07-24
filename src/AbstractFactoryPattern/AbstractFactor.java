package AbstractFactoryPattern;

import AbstractFactoryPattern.DatabaseManagment.DataBase;
import AbstractFactoryPattern.Logger.Logger;

/**
 * @description:
 * @author: wwh
 * @create: 2020/6/16
 */
public abstract class AbstractFactor {

    public  abstract DataBase getDataBase(String dataBase);
    public abstract Logger getLogger(String loggerWay);
}
