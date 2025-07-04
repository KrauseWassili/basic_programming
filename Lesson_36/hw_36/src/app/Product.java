package app;

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
