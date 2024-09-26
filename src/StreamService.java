import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamService {
    // Список потоков учебных групп
    private final List<FlowOfStudyGroups> streamList = new ArrayList<>();

    // Метод для добавления потока
    public void addStream(FlowOfStudyGroups stream) {
        streamList.add(stream);
    }

    // Метод для получения отсортированного списка потоков
    public List<FlowOfStudyGroups> getSortedStreamList() {
        // Создаем копию списка потоков для сортировки
        List<FlowOfStudyGroups> sortedList = new ArrayList<>(streamList);
        // Сортируем потоки с помощью компаратора StreamComparator
        Collections.sort(sortedList, new StreamComparator());
        return sortedList;
    }
    // Метод для сортировки списка потоков
    public void sortStreams() {
        Collections.sort(streamList, new StreamComparator());
    }
}