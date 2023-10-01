package book;

public class Book {
    private String title;
    private String author;
    private boolean borrowed;

    //mutator methods
    void setTitle(String aTitle) {
        this.title = aTitle;
    }

    void setAuthor(String theAuthor) {
        this.author = theAuthor;
    }

    void setBorrowed(boolean isBorrowed) {
        this.borrowed = isBorrowed;
    }

    //accessor metjods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public String borrow() {
        if (borrowed) {
            return ""; 
        } else {
            borrowed = true;
            return title;
        }
    }

    public boolean giveBack() {
    if (borrowed) {
        borrowed = false;
        return true; 
    } else {
        return false; 
    }
}

    public String toString() {
        return title + ": " + author;
    }
}
