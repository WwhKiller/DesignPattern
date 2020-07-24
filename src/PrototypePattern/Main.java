package PrototypePattern;

/**
 * @description:
 * @author: wwh
 * @create: 2020/7/3
 */
public class Main {
    public static void main(String[] args) {

        Studente studente = new Studente();
        studente.setId("1");
        studente.setName("张三");

        Studente studente1 = (Studente)studente.Clone();

        studente.setName("李四");
        System.out.println(studente.getName().toString());

        System.out.println(studente1.getName().toString());
    }
}
