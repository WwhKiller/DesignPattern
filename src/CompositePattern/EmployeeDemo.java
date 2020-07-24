package CompositePattern;

/**
 * @description:
 * @author: wwh
 * @create: 2020/7/24
 */
public class EmployeeDemo {
    public static void main(String[] args) {
        Employee CEO = new Employee("John","CEO", 30000);

        Employee headSales = new Employee("Robert","Head Sales", 20000);

        Employee headMarketing = new Employee("Michel","Head Marketing", 20000);

        Employee clerk1 = new Employee("Laura","Marketing", 10000);
        Employee clerk2 = new Employee("Bob","Marketing", 10000);

        Employee salesExecutive1 = new Employee("Richard","Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob","Sales", 10000);


        CEO.add(headSales);

        headSales.add(headMarketing);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        clerk1.add(salesExecutive1);
        clerk2.add(salesExecutive2);

        System.out.println("Company :" + CEO.toString());
    }
}
