package CompositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 组合模式
 * @author: wwh
 * @create: 2020/7/24
 */
public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> employees;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        employees = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ", employees=" + employees +
                '}';
    }

    public void add(Employee employee){
        employees.add(employee);
    }

    public void  remove(Employee employee){
        employees.remove(employee);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }


}
