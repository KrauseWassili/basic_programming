package app2.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ProductUtils {
    private static List<Product> productList = new ArrayList<>(List.of(
            new Product("Стол", 143.8, 8.4, 5),
            new Product("Стул", 32.4, 7.6, 22),
            new Product("Кресло", 98.3, 9.7, 7),
            new Product("Диван", 233.7, 9.5, 3),
            new Product("Ковер", 56.1, 5.3, 9)
    ));

    static Comparator<Product> compareByName = new Comparator<>() {
        @Override
        public int compare(Product o1, Product o2) {
            return o1.name.compareTo(o2.name);
        }
    };
    static Comparator<Product> compareByPriceAscending = new Comparator<>() {
        @Override
        public int compare(Product o1, Product o2) {
            return Double.compare(o1.price, o2.price);
        }
    };
    /*
    static Comparator<Product> compareByPriceDescending = new Comparator<Product>() {
        @Override
        public int compare(Product o1, Product o2) {
            return Double.compare(o1.price, o2.price);
        }
    }.reversed();
    */
    static Comparator<Product> compareByPriceDescending = compareByPriceAscending.reversed();
    static Comparator<Product> compareByQuantity = new Comparator<Product>() {
        @Override
        public int compare(Product o1, Product o2) {
            return Integer.compare(o1.getQuantity(), o2.getQuantity());
        }
    };
    static Comparator<Product> compareByRating = new Comparator<>() {
        @Override
        public int compare(Product o1, Product o2) {
            return Double.compare(o1.getRating(), o2.getRating());
        }
    };


    public static void sortBy(int criterion) {
        switch (criterion) {
            case 1:
                Collections.sort(productList, compareByName);
                break;
            case 2:
                Collections.sort(productList, compareByPriceAscending);
                break;
            case 3:
                Collections.sort(productList, compareByPriceDescending);
                break;
                case 4:
                Collections.sort(productList, compareByRating);
                break;
            case 5:
                Collections.sort(productList, compareByQuantity);
                break;
            default:
        }
    }

    public static void printProductList() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }
}