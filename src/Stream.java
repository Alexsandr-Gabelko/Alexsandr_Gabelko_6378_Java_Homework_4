import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Stream extends FlowOfStudyGroups implements Iterable<StudentGroup>  {
    private List<StudentGroup> groupList;

    public Stream(List<StudentGroup> studentGroupList) {
        super(studentGroupList);
    }

//    public Stream(List<StudentGroup> groupList) {
//        this.groupList = groupList;
//    }

    public List<StudentGroup> getGroupList() {
        return groupList;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new GroupIterator();
    }

    // Внутренний класс итератора
    private class GroupIterator implements Iterator<StudentGroup> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < groupList.size();
        }

        @Override
        public StudentGroup next() {
            if (!hasNext()) {
                throw new NoSuchElementException("Больше нет групп.");
            }
            return groupList.get(currentIndex++);
        }
    }

    // Метод для сброса итератора
    public void resetIterator() {

    }
}