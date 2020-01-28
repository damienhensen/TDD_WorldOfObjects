import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ContactManagerTest {
    ContactManager SUT;
    Contact SUT2;

    @Before
    public void setup() {
        SUT = new ContactManager();
        SUT2 = new Contact();

        SUT2.name = "Random";
        SUT2.phoneNumber = "0669696969";

        SUT.addContact(SUT2);
    }

    @Test
    public void addContact_contactAdded_TrueReturned() {
        Boolean result = SUT.addContact(SUT2);
        assertTrue(result);
    }

    @Test
    public void searchContact_contactFound_RandomReturned() {
        Contact result = SUT.searchContact("Random");
        assertThat(result.name, is("Random"));
    }

    @Test
    public void searchContact_contactFound_NumberReturned() {
        Contact result = SUT.searchContact("Random");
        assertThat(result.phoneNumber, is("0669696969"));
    }

}
