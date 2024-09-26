import java.util.Iterator;
import java.util.List;

public class FlowOfStudyGroups implements Iterable<StudentGroup> {
    private List<StudentGroup> studentGroupList;

    public FlowOfStudyGroups(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
    }

    public List<StudentGroup> getStudentGroupList() {
        return studentGroupList;
    }

    public void setStudentGroupList(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new FlowOfStudyGroupsIterator(this) ;
    }
}

