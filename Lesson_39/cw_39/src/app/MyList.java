package app;

// for Person
public interface MyList<E> extends Iterable<E>{
    int size();
    void add(E element);
    default void add(E element, int index){
        System.out.println("метод не реализован");
    };

    E get(int index);

    int indexOf(E element);

}