package StrategyPattern;

/**
 * @description:
 * @author: wwh
 * @create: 2020/9/11
 */
public class Context {

    private Strategy strategy;

    public  Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int doOperation(int num1,int num2){
       return strategy.doOperation(num1,num2);
    }

}
