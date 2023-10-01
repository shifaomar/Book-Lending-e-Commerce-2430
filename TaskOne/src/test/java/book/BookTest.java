package book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//these are commonly used assertions
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class BookTest {
    private Book book;

    @BeforeEach
    void setUp() {
        book = new Book();
    }

    @Test
    void testSetTitle() {
        book.setTitle("The Great Gatsby");
        assertEquals("The Great Gatsby", book.getTitle());
    }

    @Test
    void testSetAuthor() {
        book.setAuthor("F. Scott Fitzgerald");
        assertEquals("F. Scott Fitzgerald", book.getAuthor());
    }

    @Test
    void testSetBorrowed() {
        book.setBorrowed(true);
        assertTrue(book.isBorrowed());
    }

    @Test
    void testGetTitle() {
        book.setTitle("The Catcher in the Rye");
        assertEquals("The Catcher in the Rye", book.getTitle());
    }

    @Test
    void testGetAuthor() {
        book.setAuthor("J.D. Salinger");
        assertEquals("J.D. Salinger", book.getAuthor());
    }

    @Test
    void testIsBorrowed() {
        assertFalse(book.isBorrowed());
    }

  
    @Test
    void testToString() {
        book.setTitle("To Kill a Mockingbird");
        book.setAuthor("Harper Lee");
        assertEquals("To Kill a Mockingbird: Harper Lee", book.toString());
    }

    @Test
    void testSetBorrowedTwice() {
        book.setBorrowed(true);
        assertTrue(book.isBorrowed());

        // Try setting it to borrowed again
        book.setBorrowed(true);
        assertTrue(book.isBorrowed());
    }

    @Test
    void testBorrowAndGiveBack() {
        book.setTitle("The Hobbit");
        book.setAuthor("J.R.R. Tolkien");

        // Test borrowing the book
        assertEquals("The Hobbit", book.borrow());
        assertTrue(book.isBorrowed());

        // Test giving back the book
        assertTrue(book.giveBack());
        assertFalse(book.isBorrowed());

        // Test giving back the book that is already returned
        assertFalse(book.giveBack());
    }

    @Test
    void testSetAndGetLongTitleAndAuthor() {
        String longTitle = "This is a very long title for a book that exceeds the typical title length.";
        String longAuthor = "This is a very long author name for a book that exceeds the typical author name length.";

        book.setTitle(longTitle);
        book.setAuthor(longAuthor);

        assertEquals(longTitle, book.getTitle());
        assertEquals(longAuthor, book.getAuthor());
    }

    @Test
    void testSetTitleEmptyString() {
        book.setTitle("");
        assertEquals("", book.getTitle());
    }

    @Test
    void testSetAuthorEmptyString() {
        book.setAuthor("");
        assertEquals("", book.getAuthor());
    }

    void testSpecialTitle() {
        String specialTitle = "!@#$%^&*()_+{}[];:'\"<>,.?/";
    
        book.setTitle(specialTitle);
    
        assertEquals(specialTitle, book.getTitle());
    }

}
