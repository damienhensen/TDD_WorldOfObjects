import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PersonTest {
    Person SUT;
    Person SUT2;
    Person SUT3;

    @Before
    public void setup() {
        SUT = new Person("Damien", "123456789");
        SUT2 = new Person("Jeff", "123456429");
        SUT3 = new Person("Damien", "123456789");
    }

    @Test
    public void getUserName_nameIsDamien_DamienReturned()
    {
        String result = SUT.getUserName();
        assertThat(result, is("Damien"));
    }
    @Test
    public void isSamePerson_isNotSamePerson_FalseReturned()
    {
        boolean result = SUT.isSamePerson(SUT2);
        assertFalse(result);
    }

    @Test
    public void isSamePerson_isSamePerson_TrueReturned()
    {
        boolean result = SUT.isSamePerson(SUT3);
        assertTrue(result);
    }

}