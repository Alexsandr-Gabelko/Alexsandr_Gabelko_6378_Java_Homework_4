import java.util.Iterator;
import java.util.List;

public class FlowOfStudyGroupsIterator implements Iterator<StudentGroup> {

    public FlowOfStudyGroupsIterator(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
    }

    public List<StudentGroup> getStudentGroupList() {
        return studentGroupList;
    }

    private int count;
    private final List<StudentGroup> studentGroupList;

    public FlowOfStudyGroupsIterator(FlowOfStudyGroups flowOfStudyGroups) {
        this.studentGroupList = flowOfStudyGroups.getStudentGroupList();
        this.count = 0;
    }

    @Override
    public boolean hasNext() {
        return count < studentGroupList.size() - 1;
    }

    @Override
    public StudentGroup next() {
        if (!hasNext()){
            return null;}
        count++;
        return studentGroupList.get(count);
    }

    @Override
    public void remove() {
        studentGroupList.remove(count);
    }
}
