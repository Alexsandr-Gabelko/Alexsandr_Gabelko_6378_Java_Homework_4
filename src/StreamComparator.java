import java.util.Comparator;

public class StreamComparator implements Comparator<FlowOfStudyGroups> {



    public int compare(FlowOfStudyGroups o1, FlowOfStudyGroups o2) {
        // Сравнение количества групп в двух потоках
        return Integer.compare(o1.getStudentGroupList().size(), o2.getStudentGroupList().size());
    }
}
