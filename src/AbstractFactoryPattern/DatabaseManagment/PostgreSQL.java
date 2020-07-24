package AbstractFactoryPattern.DatabaseManagment;

/**
 * @description:
 * @author: wwh
 * @create: 2020/6/16
 */
public class PostgreSQL implements DataBase {
    @Override
    public void getDatabaseConnection() {
        System.out.println("获取PostgreSQL数据库连接");
    }
}
