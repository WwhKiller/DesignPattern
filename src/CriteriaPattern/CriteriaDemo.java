package CriteriaPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:  过滤器模式/标准模式
 * @author: wwh
 * @create: 2020/7/24
 */
public class CriteriaDemo {

    public static void main(String[] args) {
        Person malePerson = new Person("张三","male","single");
        Person femalePerson = new Person("李四","female","single");
        Person noSinglePerson =  new Person("王五","female","noSingle");

        List<Person> people = new ArrayList<>();

        people.add(malePerson);
        people.add(femalePerson);
        people.add(noSinglePerson);


        Criteria femaleCriteria = new CriteriaFemale();
        for (Person person : femaleCriteria.meetCriteria(people)){
            System.out.println("Female:"+person.toString());
        }

        Criteria maleCriteria = new CriteriaMale();
        for (Person person : maleCriteria.meetCriteria(people)){
            System.out.println("Male:"+person.toString());
        }

        Criteria singleCriteria = new CriteriaSingle();
        for (Person person : singleCriteria.meetCriteria(people)){
            System.out.println("Single:"+person.toString());
        }
        Criteria andCriteria = new AndCriteria(maleCriteria,singleCriteria);
        for (Person person : andCriteria.meetCriteria(people)){
            System.out.println("Male and Single:"+person.toString());
        }

        Criteria orCriteria = new AndCriteria(femaleCriteria,singleCriteria);
        for (Person person : orCriteria.meetCriteria(people)){
            System.out.println("female or Single :"+person.toString());
        }
    }
}
