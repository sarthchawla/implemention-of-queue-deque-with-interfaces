public interface Queue<E> {
    int size();

    boolean isEmpty();

    void Enqueue(E e);

    E front();

    E Dequeue();
}