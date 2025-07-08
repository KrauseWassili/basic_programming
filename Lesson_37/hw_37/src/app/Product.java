package app;

import java.util.Objects;

public class Product {
    String name;
    double price;
    double rating;
    int quantity;


    public Product(String name, double price, double rating, int quantity) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.quantity = quantity;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Product product)) return false;

        return Double.compare(price, product.price) == 0 && Double.compare(rating, product.rating) == 0 && quantity == product.quantity && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + Double.hashCode(price);
        result = 31 * result + Double.hashCode(rating);
        result = 31 * result + quantity;
        return result;
    }

    @Override
    public String toString() {
        return "Наименование: " + name + ", цена: " + price + "у.е., рейтинг: " + rating + ", количество: " + quantity + " шт.";
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public int getQuantity() {
        return quantity;
    }
}
