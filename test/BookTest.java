import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BookTest {
    Book SUT;

    @Before
    public void setup() {
        SUT = new Book("The First Book", "Me");
    }

    @Test
    public void borrowBook_bookBorrowed_TrueReturned()
    {
        boolean result = SUT.borrowBook();
        assertTrue(result);
    }

    @Test
    public void returnBook_bookReturned_FalseReturned()
    {
        boolean result = SUT.returnBook();
        assertFalse(result);
    }

    @Test
    public void isBorrowedBook_bookNotBorrowed_FalseReturned()
    {
        boolean result = SUT.isBorrowedBook();
        assertFalse(result);
    }
}