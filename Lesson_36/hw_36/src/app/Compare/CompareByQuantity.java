package app.Compare;

import app.Product.Product;

import java.util.Comparator;

public class CompareByQuantity implements Comparator<Product> {

    @Override
    public int compare (Product o1, Product o2){
        return Integer.compare(o1.getQuantity(),o2.getQuantity());
    }
}
