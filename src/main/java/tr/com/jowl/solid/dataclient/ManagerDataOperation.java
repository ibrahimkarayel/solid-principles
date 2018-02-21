package tr.com.jowl.solid.dataclient;

public interface ManagerDataOperation<E> {
    void update(E e);

    void delete(E e);
}
