import java.util.List;

public class TeacherView implements UserView<Teacher>{

    @Override
    public void sendOnConcole(List<Teacher> list) {
        for (Teacher teacher : list){
            // System.out.println(teacher.getSubject() + " " + teacher.getFirstName());
            System.out.println(teacher.getFirstName() + " препадаёт - " + teacher.getSubject());
        }
    }
}
