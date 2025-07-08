package app;

public interface MyList {
    int size();
    void add(Product product);
    void addByIndex(Product product, int index);
    Product get(int index);
    int indexOf(Product product);

}
