import java.time.LocalDate;

public class Teacher extends User implements Comparable<Teacher>{
    private Long teacherId;
    private String Subject;

    public Teacher() {

    }


    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public Teacher(Long teacherId, String firstName, String secondName, String patronymic,
                   LocalDate dateOfBirth, String Subject) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.teacherId = teacherId;
        this.Subject = Subject;
    }


    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }


    @Override
    public int compareTo(Teacher o) {
        return this.teacherId.compareTo(o.teacherId);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId='" + this.teacherId +'\'' +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", patronymic='" + super.getPatronymic() + '\'' +
                ", dateOfBirth=" + super.getDateOfBirth() +
                '}';
    }
}
