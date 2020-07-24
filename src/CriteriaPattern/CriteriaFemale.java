package CriteriaPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: wwh
 * @create: 2020/7/24
 */
public class CriteriaFemale implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePerson = new ArrayList<>();
        for (Person person : persons){
            if (person.getGender().equalsIgnoreCase("female")) {
                femalePerson.add(person);
            }
        }
        return femalePerson;
    }
}
