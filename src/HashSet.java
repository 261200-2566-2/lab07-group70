import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

    public class HashSet<E> implements Set<E> {

        public HashMap<E, Object> map;

        public static final Object VALUE = new Object();

        public HashSet() {
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

        public Object[] toArray() {
            // Not implemented, returning default value
            return new Object[]{VALUE};
        }

        public <T> T[] toArray(T[] a) {
            // Not implemented, returning default value
            return a;
        }

        public boolean add(E e) {
            map.put(e, VALUE);
            return true;
        }

        public boolean remove(Object o) {
            map.remove(o);
            return true;
        }

        public boolean containsAll(Collection<?> c) {
            return map.keySet().containsAll(c);
        }

        public boolean addAll(Collection<? extends E> c) {
            for (E element : c) {
                map.put(element, VALUE);
            }
            return true;
        }

        public boolean retainAll(Collection<?> c) {
            return map.keySet().retainAll(c);
        }

        public boolean removeAll(Collection<?> c) {
            return map.keySet().removeAll(c);
        }

        public void clear() {
            map.clear();
        }

        public static void main(String[] args) {
            HashSet<String> set = new HashSet<>();
            set.add("Ant");
            set.add("Bird");
            set.add("Cat");

            System.out.println("Set size: " + set.size());
            System.out.println("Set contains 'Bird': " + set.contains("Bird"));

            set.remove("Bird");

            System.out.println("Set size after removal: " + set.size());
        }
    }
