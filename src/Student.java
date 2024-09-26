import java.time.LocalDate;

public class Student extends User implements Comparable<Student>{
    private Long studentId;


    public Student(Long studentId, String firstName, String secondName, String patronymic, LocalDate dateOfBirth ) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.studentId = studentId;
    }

    public Student(Long studentId) {
        this.studentId = studentId;
    }

    public Student() {

    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    @Override
    public int compareTo(Student o) {
        return this.studentId.compareTo(o.studentId);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + this.studentId +'\'' +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", patronymic='" + super.getPatronymic() + '\'' +
                ", dateOfBirth=" + super.getDateOfBirth() +
                '}';
    }
}
