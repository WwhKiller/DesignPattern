package StrategyPattern;

/**
 * @description:
 * @author: wwh
 * @create: 2020/9/11
 */
public class AddOperation implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1+num2;
    }
}
