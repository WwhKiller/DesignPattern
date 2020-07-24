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
public class Dbconfig {

    private static DbPool dbPool = null;

    public static DbPool getDbPool(){
        if (dbPool == null){
            return initDataBase();
        }
        return dbPool;
    }

    private static  DbPool initDataBase(){
     return   new DbPool("com.mysql.cj.jdbc.Driver",
                         "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf-8&allowMultiQueries=true&useSSL=false&serverTimezone=GMT%2B8",
                         "root",
                         "123");
    }

    public static Object excuteSQL(String SQL){

        PreparedStatement ps = null;

        Connection connection = dbPool.getConnection();
        try {
             ps = connection.prepareStatement(SQL);

             if (SQLResolver(SQL).equalsIgnoreCase("select")){
                 ResultSet rs = ps.executeQuery();
                 return  rs;
             }else if(SQLResolver(SQL).equalsIgnoreCase("update")){
                 return   ps.executeUpdate();
             }else if(SQLResolver(SQL).equalsIgnoreCase("delete")){
                 return    ps.execute();
             }else if(SQLResolver(SQL).equalsIgnoreCase("insert")){
                 return  ps.execute();
             }else {
                 System.out.println("SQL 不符合语法规则，请重新输入");
                 return "SQL 不符合语法规则，请重新输入";
             }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "未知错误";

    }

    private static String SQLResolver(String SQL){
        String[] array = SQL.split(" ");
       return array[0];
    }

}
