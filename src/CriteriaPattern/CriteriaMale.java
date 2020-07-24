package CriteriaPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: wwh
 * @create: 2020/7/24
 */
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePerson = new ArrayList<>();
        for (Person person : persons){
            if (person.getGender().equalsIgnoreCase("male")){
                malePerson.add(person);
            }
        }
        return malePerson;
    }
}
