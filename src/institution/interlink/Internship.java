package institution.interlink;

import institution.University;
import lombok.Getter;
import lombok.Setter;
import person.Student;
import java.util.HashSet;

@Getter
@Setter
public class Internship {
    private String name;
    private HashSet<Student> students = new HashSet<>();

    public Internship(String name, University university) {
        setName(name);
        HashSet<Student> students = new HashSet<>();
        students.addAll(university.getStudents());
        for(Student student : students){
            if (student.getKnowledge().getLevel() >= university.getUniversityKnowledgeLevel()) setStudent(student);
        }
    }

    public void setStudent(Student student) {
        if(student.getFullName() != null && student.getGender() != "" && student.getKnowledge().getLevel()>=60)
            students.add(student);
    }

    public String getStudents() {
        String result = "";
        for(Student student : students){
            result = result + student.getFullName() + "\n";
        }
        return result;
    }
}
