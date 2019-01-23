package person;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    private String name;
    private String surname;
    private String patronymic;
    private String gender;
    private static final String male = "MALE";
    private static final String female = "FEMALE";

    public String getFullName(){
        return getName() + " " + getSurname() + " " + getPatronymic();
    }

    public void setGender(String gender){
        if (gender.equals(male) || gender.equals(female)) this.gender=gender;
        else this.gender = "";
    }

}
