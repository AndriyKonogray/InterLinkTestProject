package person;

import person.consciousness.Knowledge;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student extends  Person {
    private Knowledge knowledge;

    public Student(String name, String surname, String gender, int level) {
        setPatronymic("");
        setName(name);
        setSurname(surname);
        setGender(gender);
        setKnowledge(new Knowledge(level));
    }

    public void setKnowledge(Knowledge knowledge) {
        this.knowledge = knowledge;
    }
}
