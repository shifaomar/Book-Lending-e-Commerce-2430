package ecommerce;

public class Product {
    private int productId;
    private String name;
    private double wholesaleCost;
    private static double taxRate = 0.25; 
    private double markup = 0.13; 

    // mutator methods
    void setProductId(int theProductId) {
        this.productId = theProductId;
    }

    void setName(String itsName) {
        this.name = itsName;
    }

    void setCost(double theCost) {
        this.wholesaleCost = theCost;
    }

    static void setTaxRate(double theRate) {
        if (theRate >= 0 && theRate <= 1) {
            taxRate = theRate;
        }
    }

    void setMarkUp(double theMarkup) {
        if (theMarkup >= 0 && theMarkup <= 1) {
            this.markup = theMarkup;
        }
    }

    // Public accessor methods
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return wholesaleCost;
    }

    public double getRetailPrice() {
        return wholesaleCost * (1 + markup) * (1 + taxRate);
    }

    public double getMarkupRate() {
        return markup;
    }

    public static double getTaxRate() {
        return taxRate;
    }

    public String toString() {
        return name + ": " + String.format("%.2f", getRetailPrice());
    }
}