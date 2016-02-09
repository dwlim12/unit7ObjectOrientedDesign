

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BillfoldTest
{
    /**
     * Default constructor for objects of class BillfoldTest
     */
    public BillfoldTest()
    {
        
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testBillFold()
    {
        Billfold two_cards = new Billfold();
        IDCard id = new IDCard("Bob", "71109");
        DriversLicense dl = new DriversLicense("Bob", 2010);
        two_cards.addCard(id);
        two_cards.addCard(dl);
        two_cards.formatCards();
        System.out.println(two_cards.getExpiredCardCount());
    }

}
