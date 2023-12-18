import java.util.AbstractSet;
import java.util.HashMap;
import java.util.Iterator;

public class SetAndHashset<E> extends AbstractSet<E> {

    public HashMap<E, Object> map;

    public static final Object VALUE = new Object();

    public SetAndHashset() {
        this.map = new HashMap<>();
    }

    public int size() {
        return map.size();
    }

    public boolean isEmpty() {
        return map.isEmpty();
    }

    public boolean contains(Object o) {
        return map.containsKey(o);
    }

    public Iterator<E> iterator() {
        return map.keySet().iterator();
    }


    public boolean add(E e) {
        map.put(e, VALUE);
        return true;
    }


    public boolean remove(Object o) {
        map.remove(o);
        return true;
    }

    public void clear() {
        map.clear();
    }

    public static void main(String[] args) {
        SetAndHashset<String> set = new SetAndHashset<>();
        set.add("Ant");
        set.add("Bird");
        set.add("Cat");

        System.out.println("Set size: " + set.size());
        System.out.println("Set contains 'Bird': " + set.contains("Bird"));

        set.remove("Bird");

        System.out.println("Set size after removal: " + set.size());
    }
}
