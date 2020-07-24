package DBConnectionPool;

/**
 * @description:
 * @author: wwh
 * @create: 2020/7/13
 */
public class ConnectionPoolUtils {
    private ConnectionPoolUtils() {}; //私有静态方法
    private static ConnectionPool poolInstance = null;
    public static ConnectionPool GetPoolInstance() {
        if(poolInstance == null) {
            poolInstance = new ConnectionPool(
                    "com.mysql.jdbc.Driver",
                    "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf-8",
                    "root", "123");
            try {
                poolInstance.createPool();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return poolInstance;
    }
}