package app;

import app.Compare.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ProductUtils {
    private static List<Product> productListTemp = List.of(
            new Product("Стол", 143.8, 8.4, 5),
            new Product("Стул", 32.4, 7.6, 22),
            new Product("Кресло", 98.3, 9.7, 7),
            new Product("Диван", 233.7, 9.5, 3),
            new Product("Ковер", 56.1, 5.3, 9)
    );
    private static List<Product> productList = new ArrayList<>(productListTemp);

    public static void sortBy(int criterion) {
        switch (criterion) {
            case 1:
                Collections.sort(productList, new CompareByName());
                break;
            case 2:
                Collections.sort(productList, new CompareByPrice());
                break;
            case 3:
                Collections.sort(productList, new CompareByRating());
                break;
            case 4:
                Collections.sort(productList, new CompareByQuantity());
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