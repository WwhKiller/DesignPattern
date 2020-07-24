package CriteriaPattern;

import java.util.List;

/**
 * @description:
 * @author: wwh
 * @create: 2020/7/24
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
