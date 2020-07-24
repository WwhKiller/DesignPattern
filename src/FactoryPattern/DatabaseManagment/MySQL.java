package FactoryPattern.DatabaseManagment;

/**
 * @description:
 * @author: wwh
 * @create: 2020/6/16
 */
public class MySQL implements DataBase{
    @Override
    public void getDatabaseConnection() {
        System.out.println("获取MySQL数据库连接");
    }
}
