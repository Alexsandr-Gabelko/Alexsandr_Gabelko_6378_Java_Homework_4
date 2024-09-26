import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Student student_1 = new Student(3L, "Василий", "Иванов", "Иванович",
                LocalDate.of(2007, 12, 3));
        Student student_2 = new Student(1L, "Иван", "Иванов", "Иванович",
                LocalDate.of(2007, 12, 3));
        Student student_3 = new Student(2L, "Петр", "Иванов", "Иванович",
                LocalDate.of(2007, 12, 3));
        Student student_4 = new Student(3L, "Сергей", "Иванов", "Иванович",
                LocalDate.of(2007, 12, 3));

        Student student_5 = new Student(3L, "Василий", "Петров", "Иванович",
                LocalDate.of(2007, 12, 3));
        Student student_6 = new Student(1L, "Иван", "Петров", "Иванович",
                LocalDate.of(2007, 12, 3));
        Student student_7 = new Student(2L, "Петр", "Петров", "Иванович",
                LocalDate.of(2007, 12, 3));

        Student student_8 = new Student(3L, "Василий", "Сидоров", "Иванович",
                LocalDate.of(2007, 12, 3));
        Student student_9 = new Student(1L, "Иван", "Сидоров", "Иванович",
                LocalDate.of(2007, 12, 3));
        Student student_10 = new Student(2L, "Петр", "Сидоров", "Иванович",
                LocalDate.of(2007, 12, 3));

        Student student_11 = new Student(3L, "Сергей", "Скворцов", "Иванович",
                LocalDate.of(2007, 12, 3));
        Student student_12 = new Student(1L, "Иван", "Скворцов", "Иванович",
                LocalDate.of(2007, 12, 3));
        Student student_13 = new Student(2L, "Петр", "Скворцов", "Иванович",
                LocalDate.of(2007, 12, 3));

        Student student_14 = new Student(3L, "Сергей", "Васильев", "Иванович",
                LocalDate.of(2007, 12, 3));
        Student student_15 = new Student(1L, "Иван", "Васильев", "Иванович",
                LocalDate.of(2007, 12, 3));
        Student student_16 = new Student(2L, "Петр", "Васильев", "Иванович",
                LocalDate.of(2007, 12, 3));


        List<Student> studentList_1 = new ArrayList<>() ;
        studentList_1.add(student_1);
        studentList_1.add(student_2);
        studentList_1.add(student_3);
        studentList_1.add(student_4);

        List<Student> studentList_2 = new ArrayList<>() ;
        studentList_2.add(student_5);
        studentList_2.add(student_6);
        studentList_2.add(student_7);

        List<Student> studentList_3 = new ArrayList<>() ;
        studentList_2.add(student_8);
        studentList_2.add(student_9);
        studentList_2.add(student_10);

        List<Student> studentList_4 = new ArrayList<>() ;
        studentList_2.add(student_11);
        studentList_2.add(student_12);
        studentList_2.add(student_13);

        List<Student> studentList_5 = new ArrayList<>() ;
        studentList_2.add(student_14);
        studentList_2.add(student_15);
        studentList_2.add(student_16);


        StudentGroup group_1 = new StudentGroup(studentList_1);
        StudentGroup group_2 = new StudentGroup(studentList_2);
        StudentGroup group_3 = new StudentGroup(studentList_3);
        StudentGroup group_4 = new StudentGroup(studentList_4);
        StudentGroup group_5 = new StudentGroup(studentList_5);

        for (Student student : group_1) {
            System.out.println(student.getFirstName());
        }
        System.out.println("-------------------------------------");
        // Получаем итератор из группы студентов
        Iterator<Student> iterator = group_1.iterator();

        // Итерируемся по студентам с использованием while и итератора
        System.out.println("Итерируемся по студентам с использованием while и итератора");
        while (iterator.hasNext()) {
            Student student = iterator.next();  // Получаем следующего студента
            System.out.println(student.getFirstName());  // Печатаем имя студента
        }

        List<StudentGroup> studentGroupList_1 = new ArrayList<>();
        studentGroupList_1.add(group_1);
        studentGroupList_1.add(group_2);
        Iterator<StudentGroup> iterator_1 = studentGroupList_1.iterator();

        List<StudentGroup> studentGroupList_2 = new ArrayList<>();
        studentGroupList_2.add(group_3);
        studentGroupList_2.add(group_4);
        studentGroupList_2.add(group_5);

        // Итерируемся по группам с использованием while и итератора
        System.out.println("Итерируемся по группам :");
        while (iterator_1.hasNext()) {
            StudentGroup studentGroup = iterator_1.next();  // Получаем следующию группу
            System.out.println(studentGroup.getStudentList());  // Печатаем список студентов
        }

        StudentController controller = new StudentController();
        //Создаем потоки с учебными группами
        FlowOfStudyGroups stream1 = new FlowOfStudyGroups(studentGroupList_1);
        FlowOfStudyGroups stream2 = new FlowOfStudyGroups(studentGroupList_2);
        // Добавляем потоки в контроллер
        controller.addStream(stream1);
        controller.addStream(stream2);
        // Сортируем потоки
        controller.sortStreams();
        // Получаем отсортированный список потоков
        List<FlowOfStudyGroups> sortedStreams = controller.getSortedStreamList();
        // Выводим количество групп в каждом потоке
        System.out.println("Отсортированные потоки:");
        for (FlowOfStudyGroups stream : sortedStreams) {
            System.out.println("Поток с количеством групп: " + stream.getStudentGroupList().size());
        }
            StudentView studentView = new StudentView();
            studentView.sendOnConcole(studentList_1);



    TeacherService teacherService = new TeacherService();
    TeacherView teacherView = new TeacherView();
    TeacherController teacherController = new TeacherController(teacherService, teacherView);


    Teacher teacher_1 = new Teacher(1L, "Васильева", "Лидия", "Петровна",
            LocalDate.of(1980, 12, 3), "Информатика");
    Teacher teacher_2 = new Teacher(2L, "Мальцев", "Владимир", "Петрович",
            LocalDate.of(1980, 12, 3), "Физика");
    Teacher teacher_3 = new Teacher(3L, "Мальцев", "Владимир", "Петрович",
            LocalDate.of(1980, 12, 3), "Физика");


    // Добавить учителей
       teacherController.addTeacher(1L, "Васильева", "Лидия", "Петровна",
               LocalDate.of(1980, 12, 3), "Информатика");
        teacherController.addTeacher(2L, "Мальцев", "Владимир", "Петрович",
                LocalDate.of(1980, 12, 3), "Физика");
        teacherController.addTeacher(3L, "Михайлоы", "Владимир", "Петрович",
                LocalDate.of(1980, 12, 3), "Математика");

        System.out.println("--");
        System.out.println(teacherController.getAllTeachers().size());
        System.out.println("--");
       // Вывести всех по предметам
        teacherController.showAllTeachers();
       // Отредактировать по фамилии и предмету
        teacherController.editTeacher(2L, "Борисов", "География");
        System.out.println("Отредактированный спмсок");
        teacherController.showAllTeachers();

    }
}
