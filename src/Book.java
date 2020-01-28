public class Book {

    private String title;
    private String author;
    private boolean isBorrowed;

    // Constructor
    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
    }

    public boolean borrowBook()
    {
        isBorrowed = true;
        return true;
    }

    public boolean returnBook()
    {
        isBorrowed = false;
        return false;
    }

    public boolean isBorrowedBook()
    {
        return isBorrowed;
    }
}
