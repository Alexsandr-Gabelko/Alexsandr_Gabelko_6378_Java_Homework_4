import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TeacherService extends Teacher {

    //private List<Teacher> teacherList;
    private final List<Teacher> teachers = new ArrayList<>();
    //private Long nextId = 1L; // Для автоматической генерации ID

    public TeacherService(Long teacherId, String firstName, String secondName, String patronymic,
                          LocalDate dateOfBirth, String Subject)   {
        super(teacherId, firstName, secondName, patronymic, dateOfBirth, Subject);
    }

    public TeacherService() {

    }


    // Добавить учителя
    public void addTeacher(Long teacherId, String firstName, String secondName, String patronymic,
                           LocalDate dateOfBirth, String Subject){
        Teacher teacher = new Teacher( teacherId, firstName, secondName, patronymic, dateOfBirth, Subject);
        teachers.add(teacher);


    }
    // Редактировать учителя
    public void editTeacher(Long teacherId, String newfirstName, String newSubject) {
        for (Teacher teacher : teachers) {
            if (teacher.getTeacherId() == teacherId) {
                teacher.setFirstName(newfirstName);
                teacher.setSubject(newSubject);
                break;
            }
        }
    }
    // Вывести всех учителей
    public List<Teacher> getAllTeachers() {
        return teachers;
    }
}



