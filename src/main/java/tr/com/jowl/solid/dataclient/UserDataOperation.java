package tr.com.jowl.solid.dataclient;

public interface UserDataOperation<E> {

    void read(E e);

    void write(E e);

}
