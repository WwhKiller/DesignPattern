package StrategyPattern;

/**
 * @description:
 * @author: wwh
 * @create: 2020/9/11
 */
public class Main {
    public static void main(String[] args) {

        int num1 =9,num2=4;

        Context subOperation = new Context(new SubOperation());

        System.out.println(subOperation.doOperation(num1, num2));

        Context addOperation = new Context(new AddOperation());

        System.out.println(addOperation.doOperation(num1, num2));

        Context mutlOperation = new Context(new MutlOperation());

        System.out.println(mutlOperation.doOperation(num1, num2));
    }
}
