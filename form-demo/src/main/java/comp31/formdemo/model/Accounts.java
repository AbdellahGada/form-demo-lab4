package comp31.formdemo.model;
import java.util.ArrayList;
import org.springframework.stereotype.Component;



@Component
public class Accounts extends ArrayList<Person>{

    public Person findByUserId(String userId) {
        for (Person person : this) {
        if (person.getUserId().equals(userId))
        return person;
        }
        return null;
        }
    
}
