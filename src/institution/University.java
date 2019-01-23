package institution;

import lombok.Getter;
import lombok.Setter;
import person.Student;
import java.util.HashSet;

@Getter
@Setter
public class University {
    private String name;
    private HashSet<Student> students = new HashSet<>();
    public University(String name) { setName(name); }

    public void setStudent(Student student) {
        if(student.getFullName()!=null && student.getGender()!="" && student.getKnowledge().getGrade()>=60)
            students.add(student);
    }

    public void addStudent(Student student) {
        setStudent(student);
    }
}
