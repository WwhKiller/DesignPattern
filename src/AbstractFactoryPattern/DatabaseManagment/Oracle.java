package AbstractFactoryPattern.DatabaseManagment;

/**
 * @description:
 * @author: wwh
 * @create: 2020/6/16
 */
public class Oracle implements DataBase {
    @Override
    public void getDatabaseConnection() {
        System.out.println("获取Oracle数据库连接");
    }
}
