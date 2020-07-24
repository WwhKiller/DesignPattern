package FactoryPattern.DatabaseManagment;

/**
 * @description:
 * @author: wwh
 * @create: 2020/6/16
 */
public class SQLServer implements DataBase {

    @Override
    public void getDatabaseConnection() {
        System.out.println("获取SQLServer数据库连接");
    }
}
