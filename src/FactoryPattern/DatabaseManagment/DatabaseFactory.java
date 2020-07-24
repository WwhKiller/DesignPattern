package FactoryPattern.DatabaseManagment;

/**
 * @description:
 * @author: wwh
 * @create: 2020/6/16
 */
public class DatabaseFactory {
    public static DataBase getDataBase(String dataBase){
        if (dataBase==null){
            return null;
        }if (dataBase.equalsIgnoreCase("mysql")){
            return new MySQL();
        }if (dataBase.equalsIgnoreCase("oracle")){
            return new Oracle();
        }if (dataBase.equalsIgnoreCase("postgresql")){
            return new PostgreSQL();
        }if (dataBase.equalsIgnoreCase("sqlserver")){
            return new SQLServer();
        }return null;
    }
}
