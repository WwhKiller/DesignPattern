package CriteriaPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: wwh
 * @create: 2020/7/24
 */
public class CriteriaSingle implements Criteria{

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePerson = new ArrayList<>();
        for (Person person : persons){
            if (person.getMaritalStatus().equalsIgnoreCase("single")) {
                singlePerson.add(person);
            }
        }
        return singlePerson;
    }
}
