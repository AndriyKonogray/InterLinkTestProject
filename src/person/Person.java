package person;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    private String name;
    private String surname;
    private String putronomic;
    private String sex;

    public String getFullName(){
        return getName() + " " + getSurname() + " " + getPutronomic();
    }
}
