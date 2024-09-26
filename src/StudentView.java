import java.util.List;

public class StudentView implements UserView<Student>{
    @Override
    public void sendOnConcole(List<Student> list) {
        for(Student student : list){
            System.out.println(student.getStudentId());
        }
    }
}
