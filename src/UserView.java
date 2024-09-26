import java.util.List;

public interface UserView <T extends User>{

    void sendOnConcole(List<T> list);
}
