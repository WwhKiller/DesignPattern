package Singleton;

/**
 * @description:  静态内部类
 * @author: wwh
 * @create: 2020/6/20
 */
public class StaticSingleton {

    private static class StaticSingletonholder{
    private static final StaticSingleton staticSingleton= new StaticSingleton();
    }

    private StaticSingleton(){};

    public final StaticSingleton getStaticSingleton(){
        return StaticSingletonholder.staticSingleton;
    }
}
