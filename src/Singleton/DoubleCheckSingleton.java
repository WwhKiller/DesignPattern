package Singleton;

/**
 * @description: 双重锁
 * @author: wwh
 * @create: 2020/6/20
 */
public class DoubleCheckSingleton {

    private static volatile DoubleCheckSingleton doubleCheckSingleton;
    private DoubleCheckSingleton(){};

    public static DoubleCheckSingleton getdoubleCheckSingleton(){
        if (doubleCheckSingleton == null){
            synchronized (DoubleCheckSingleton.class) {
                if (doubleCheckSingleton == null) {
                    doubleCheckSingleton = new DoubleCheckSingleton();
                }
            }
        }
        return doubleCheckSingleton;
    }
}
