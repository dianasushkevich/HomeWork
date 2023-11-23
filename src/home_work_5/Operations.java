import java.util.Collection;

public interface Operations {
    <T> void doOperations(T t, Collection collection, int count);
}