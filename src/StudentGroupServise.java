import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentGroupServise {
    private StudentGroup studentGroup;

    public void removeStudentByFIO(String firstName, String secondName, String patronymic) {
        Iterator<Student> iterator = studentGroup.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getFirstName().equals(firstName) && student.getSecondName().equals(secondName)
                    && student.getPatronymic().equals(patronymic)) {
                iterator.remove();
            }
        }
    }
    public List<Student> getSortedStudentList(){

        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
        Collections.sort(studentList);
        return studentList;
    }
    public List<Student> getSortedStudentByFIO() {
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
        studentList.sort(new UserComparator<Student>());
        return studentList;
    }

    public void createStudent(String firstName, String secondName, String patronymic){
        studentGroup.createStudent(firstName, secondName, patronymic);
    }
}
