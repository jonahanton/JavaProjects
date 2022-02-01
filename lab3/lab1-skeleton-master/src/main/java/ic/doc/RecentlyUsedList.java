package ic.doc;

import java.util.Collections;
import java.util.LinkedList;

public class RecentlyUsedList<E> {

    private LinkedList<E> list = new LinkedList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void add(E item) {
        if (list.contains(item)) {
            list.remove(item);
        }

        list.addFirst(item);
    }


    public boolean contains(E item) {
       return list.contains(item);
    }

    public E get(int i) {
       E item = list.get(i);
       return item;
    }

    public E getFirst() {
       return list.getFirst();
    }

    public int countItem(E item) {
        return Collections.frequency(list, item);
    }
}
