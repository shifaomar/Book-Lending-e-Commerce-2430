package book; // Make sure to use the correct package name

public class Runner {

    public static void main(String[] args) {
        // Creating instances 
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();

        
        book1.setTitle("The Secret Garden");
        book1.setAuthor("Frances Hodgson Burnett");

        book2.setTitle("Anne of Green Gables");
        book2.setAuthor("Lucy Maud Montgomery");
        
        book3.setTitle("Little Women");
        book3.setAuthor("Louisa May Alcott");

        // Adding Books
        System.out.println("-- Adding Books --");
        System.out.println(book1.toString() + " - added.");
        System.out.println(book2.toString() + " - added.");
        System.out.println(book3.toString() + " - added.");


        // Borrowing Books
        System.out.println("\n-- Borrowing Books --");
        System.out.println(book1.borrow() + " : borrowed.");
        System.out.println(book2.borrow() + " : borrowed.");
        

        // Checking Availability
        System.out.println("\n-- Checking which books are available --");
        System.out.println(book1.getTitle() + " : " + (book1.isBorrowed() ? "not available." : "available."));
        System.out.println(book2.getTitle() + " : " + (book2.isBorrowed() ? "not available." : "available."));
        System.out.println(book3.getTitle() + " : " + (book3.isBorrowed() ? "not available." : "available."));

        // Returning Books
        System.out.println("\n-- Returning Books --");
        System.out.println(book1.giveBack() + " : returned.");
        System.out.println(book2.giveBack() + " : returned.");
        

        // Checking The Availability Again
        System.out.println("\n-- Checking which books are available --");
        System.out.println(book1.getTitle() + " : " + (book1.isBorrowed() ? "not available." : "available."));
        System.out.println(book2.getTitle() + " : " + (book2.isBorrowed() ? "not available." : "available."));
        System.out.println(book3.getTitle() + " : " + (book3.isBorrowed() ? "not available." : "available."));

    }
}