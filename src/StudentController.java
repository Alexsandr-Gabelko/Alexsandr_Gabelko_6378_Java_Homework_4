import java.util.List;

public class StudentController implements UserController<Student> {
    private final StudentGroupServise studentGroupServise = new StudentGroupServise();
    private final StreamService streamService = new StreamService();

    private final StudentView studentView = new StudentView();

    public void removeStudentByFIO(String firstName, String secondName, String patronymic) {
        studentGroupServise.removeStudentByFIO(firstName, secondName, patronymic);
    }

    public List<Student> getSortedStudentList() {
        List<Student> studentList = studentGroupServise.getSortedStudentList();
        studentView.sendOnConcole(studentList);
        return studentList;

    }

    public List<Student> getSortedStudentByFIO(){
        List<Student> studentList = studentGroupServise.getSortedStudentByFIO();
        studentView.sendOnConcole(studentList);
        return studentList;
   }

    public List<FlowOfStudyGroups> getSortedStreamList() {
        return streamService.getSortedStreamList();  // Вызов метода сортировки потоков
    }

    public void addStream(FlowOfStudyGroups stream) {
        streamService.addStream(stream);
    }
    public void sortStreams() {
        streamService.sortStreams(); // Сортировка списка потоков
    }

    @Override
    public void create(String firstName, String secondName, String patronymic) {
    studentGroupServise.createStudent(firstName, secondName, patronymic);
    }
}



