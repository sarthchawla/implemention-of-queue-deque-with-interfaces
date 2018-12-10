import java.util.*;

public class LinkedQueue<E> implements Deque<E> {

    private SinglyLinkedList<E> list = new SinglyLinkedList<E>(); // an empty list

    public LinkedQueue() {
    } // new stack relies on the initially empty list

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void addLast(E element) {
        list.addLast(element);
    }

    public void addFirst(E element) {
        list.addFirst(element);
    }

    public E getFirst() {
        return list.first();
    }

    public E getLast() {
        return list.last();
    }

    public E removeFirst() {
        if (list.isEmpty())
            return null;
        return list.removeFirst();
    }

    public E removeLast() {
        if (list.isEmpty())
            return null;
        return list.removeLast();
    }

}