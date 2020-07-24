package FactoryPattern.DatabaseManagment;

/**
 * @description:
 * @author: wwh
 * @create: 2020/6/16
 */
public class DataBaseMain {
    public static void main(String[] args) {
        //获取MySQL数据库
        DataBase MySQL = DatabaseFactory.getDataBase("mysql");
        MySQL.getDatabaseConnection();

        //获取Oracle数据库
        DataBase Oracle = DatabaseFactory.getDataBase("oracle");
        Oracle.getDatabaseConnection();

        //获取Oracle数据库
        DataBase PostgreSQL = DatabaseFactory.getDataBase("postgresql");
        PostgreSQL.getDatabaseConnection();

        //获取Oracle数据库
        DataBase SQLServer = DatabaseFactory.getDataBase("sqlserver");
        SQLServer.getDatabaseConnection();
    }
}
