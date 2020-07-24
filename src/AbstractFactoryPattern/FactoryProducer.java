package AbstractFactoryPattern;

import AbstractFactoryPattern.DatabaseManagment.DatabaseFactory;
import AbstractFactoryPattern.Logger.LoggerFactory;

/**
 * @description:
 * @author: wwh
 * @create: 2020/6/16
 */
public class FactoryProducer {

    public static AbstractFactor getAbstractFactor(String choice){
        if (choice==null){
            return null;
        }if (choice.equalsIgnoreCase("database")){
            return new DatabaseFactory();
        }if (choice.equalsIgnoreCase("logger")){
            return new LoggerFactory();
        }return null;

    }
}
