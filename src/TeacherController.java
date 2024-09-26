import java.time.LocalDate;

public class TeacherController extends TeacherService   {
    private final TeacherService teacherService;
    private final TeacherView teacherView;

    public TeacherController(TeacherService teacherService, TeacherView teacherView) {
        this.teacherService = teacherService;
        this.teacherView = teacherView;
    }

    //Добавить учителя
    public void addTeacher(Long teacherId, String firstName, String secondName, String patronymic,
                           LocalDate dateOfBirth, String Subject) {
        teacherService.addTeacher(teacherId, firstName, secondName, patronymic, dateOfBirth, Subject);
    }
    //Редоктировать учителя
    public void editTeacher(Long teacherId, String newFirstName, String newSubject) {
        teacherService.editTeacher( teacherId, newFirstName, newSubject);
    }
    //Вывести всех учителя по предметам
    public void showAllTeachers() {
        teacherView.sendOnConcole(teacherService.getAllTeachers());

    }

}
