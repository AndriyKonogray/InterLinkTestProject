package institution;

import lombok.Getter;
import lombok.Setter;
import person.Student;
import person.consciousness.Knowledge;

import java.util.HashSet;

@Getter
@Setter
public class University {
    private String name;
    private HashSet<Student> students = new HashSet<>();
    private int universityKnowledgeLevel = 0;

    public University(String name) { setName(name); }

    public void setStudent(Student student) {
        if(student.getFullName() != null && student.getGender() != "" && student.getKnowledge().getLevel() >= 60) {
            students.add(student);
            setUniversityKnowledgeLevel();
        }
    }

    public void addStudent(Student student) {
        setStudent(student);
    }

    private void setUniversityKnowledgeLevel(){
        int result = 0;
        for(Student student : students)
            result += student.getKnowledge().getLevel();
        result /= students.size();
        universityKnowledgeLevel = result;
    }
}
