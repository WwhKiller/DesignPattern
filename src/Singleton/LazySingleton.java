package Singleton;

/**
 * @description: 懒汉式，线程安全你的单例
 * @author: wwh
 * @create: 2020/6/20
 */
public class LazySingleton {

    private static  LazySingleton lazySingleton;

    private  LazySingleton(){};

    public static synchronized  LazySingleton getLazySingleton(){
        if (lazySingleton == null){
            return new LazySingleton();
        }else {
            return lazySingleton;
        }
    }
}
