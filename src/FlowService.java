import java.util.Collections;
import java.util.List;

public class FlowService {

    // Метод сортировки списка потоков
    public void sortStreams(List<Stream> streamList) {
        // Используем StreamComparator для сортировки списка потоков
        Collections.sort(streamList, new StreamComparator());
    }
}
