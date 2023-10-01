package ecommerce;

public class Runner {
    public static void main(String[] args) {
        // Creating instances of Product
        Product item1 = new Product();
        item1.setProductId(524);
        item1.setName("Apple");
        item1.setCost(10.0);

        Product item2 = new Product();
        item2.setProductId(274);
        item2.setName("Orange");
        item2.setCost(15.0);

        Product item3 = new Product();
        item3.setProductId(156);
        item3.setName("tomato");
        item3.setCost(30.0);

        Product item4 = new Product();
        item4.setProductId(349);
        item4.setName("avocado");
        item4.setCost(200.0);

        // Creating ShoppingCart and adding products
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(item1);
        cart.addProduct(item2);
        cart.addProduct(item3);
        cart.addProduct(item4);
        
        System.out.println("Items in the cart:");
        System.out.println(cart);

        System.out.println("Total Cart Price (before tax): $" + cart.beforeTaxPrice());
        
        System.out.println("Removing item number " + item4.getProductId() + ": " + item4.getName());
        cart.removeProduct(item4);

        System.out.println("Items in the cart:");
        System.out.println(cart.toString());

        System.out.println("Total Cart Price before tax: $" + cart.beforeTaxPrice());

        // Checkout and cart size
        System.out.println("Checking out \nNumber of items in the cart = " + cart.getCartSize());
        System.out.println("Total Cart Price including tax: $" + cart.totalCartPrice());
        cart.checkout();
        System.out.println("Items in the cart after checkout: " + cart.getCartSize());
        System.out.println("Thank you for shopping with us!");
    }
}