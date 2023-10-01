package ecommerce;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addProduct(Product product) {
        items.add(product);
    }

    public void removeProduct(Product product) {
        items.remove(product);
    }

    public boolean hasProduct(Product product) {
        return items.contains(product);
    }

    public double totalCartPrice() {
        double totalPrice = 0.0;
        for (Product product : items) {
            totalPrice += product.getRetailPrice();
        }
        return totalPrice;
    }

    public double beforeTaxPrice() {
        double totalPrice = 0.0;
        for (Product product : items) {
            totalPrice += product.getCost();
        }
        return totalPrice;
    }

    public double checkout() {
        double totalPrice = totalCartPrice();
        items.clear(); 
        return totalPrice;
    }

    public int getCartSize() {
        return items.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Product product : items) {
            sb.append(product.toString()).append("\n");
        }
        return sb.toString();
    }
}