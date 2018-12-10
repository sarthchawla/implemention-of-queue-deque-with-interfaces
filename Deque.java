public interface Deque<E> extends Queue<E> {
    void addFirst(E e);

    void addLast(E e);

    E removeFirst();

    E removeLast();

    E getFirst();

    E getLast();

    @Override
    default void Enqueue(E e) {
        addLast(e);
    }

    @Override
    default E Dequeue() {
        return removeFirst();
    }

    @Override
    default E front() {
        return getFirst();
    }
}