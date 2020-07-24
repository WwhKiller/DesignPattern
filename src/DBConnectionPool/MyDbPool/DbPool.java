package DBConnectionPool.MyDbPool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

/**
 * @description:
 * @author: wwh
 * @create: 2020/7/13
 */
public class DbPool {
    private String jdbcDriver = ""; // 数据库驱动
    private String url = ""; // 数据 URL
    private String user = ""; // 数据库用户名
    private String password = ""; // 数据库用户密码


    private Vector dbPools = new Vector();
    private int initCapacity = 1<<4; //初始化容量
    private int maxCapacity = 1<<6; //最大为64

    public DbPool(String jdbcDriver, String url, String user, String password) {
        this.jdbcDriver = jdbcDriver;
        this.url = url;
        this.user = user;
        this.password = password;
        this.dbPools = new Vector(initCapacity);
        creatPool(initCapacity);
    }


    //初始化连接池
    public DbPool(String jdbcDriver, String url, String user, String password,int capacity) {
        this.jdbcDriver = jdbcDriver;
        this.url = url;
        this.user = user;
        this.password = password;

        this.initCapacity = capacity;
        if (capacity > 0 && capacity <= maxCapacity) {
            this.dbPools = new Vector(capacity);
            creatPool(capacity);
        }else {
            System.out.println("初始化容量不能大于最大容量");
        }
    }

    //从连接池中获取数据库连接
    public Connection getConnection(){
        if (this.dbPools.size() > 0 ) {
            Connection connection = (Connection) this.dbPools.get(0);
            this.dbPools.remove(connection);
        }return null;
    }
    //从连接池中获取数据库连接
    public void returnConnection(Connection connection){
            if (connection != null){
                this.dbPools.addElement(connection);
            }
    }

    //将数据库连接存入连接池中
    public synchronized void addPool(){
        if (dbPools.size()>this.maxCapacity){
            System.out.println("数据库连接池已经到了最大数");
            return;
        }
        this.dbPools.addElement(getConnection());
    }

    public void creatPool(int capactity){

        //dbpools 不等于0 说明已经存在连接，所以直接返回
        if (this.dbPools.size() !=0){
            return;
        }
        creatConnections(capactity);
    }

    //创建连接
    public void creatConnections(int capacity) {

        Connection connection = null;
        for (int i= 0; i <= capacity; i++){
            try {
                Class.forName(this.jdbcDriver);

                connection = DriverManager.getConnection(url,user,password);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            this.dbPools.addElement(connection);
        }
    }

    //关闭数据库连接池,（关闭每一个连接，然后清空Vector）
    public synchronized void closePool(){
        for (int i =this.dbPools.size(); i< 0 ;i--){
            Connection connection  =(Connection)this.dbPools.get(i);
            try {
                connection.close();
                this.dbPools.remove(i);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }



}
