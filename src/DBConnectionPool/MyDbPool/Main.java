package DBConnectionPool.MyDbPool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @description:
 * @author: wwh
 * @create: 2020/7/13
 */
public class Main {


    public static void main(String[] args) {

        DbPool dbPool = Dbconfig.getDbPool();

        Connection connection = dbPool.getConnection();

        String sql = "select * from student ";

        Long startTime = System.currentTimeMillis();

        PreparedStatement ps  =null;
        ResultSet rs = null;
        for (int i = 0; i < 100 ; i++){
            try {
                 ps  = connection.prepareStatement(sql);
                 rs = ps.executeQuery();
                while (rs.next()){
                    String name =  rs.getString("name");
                    System.out.println("name "+name);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                try {
                    rs.close();
                    ps.close();
                    connection.close();
                    dbPool.returnConnection(connection);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("经过100次的循环调用，使用连接池花费的时间:"+ (System.currentTimeMillis() - startTime) + "ms");
    }
}
