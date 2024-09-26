import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {

    private int count;
    private final List<Student> studentList;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentList = studentGroup.getStudentList();
        this.count = 0;
    }


    @Override
    public boolean hasNext() {
        return count < studentList.size() ;
    }

    @Override
    public Student next() {
        if (!hasNext()){
            return null;}
        count++;
        return studentList.get(count-1);

    }

    @Override
    public void remove() {
        studentList.remove(count);
    }
}
