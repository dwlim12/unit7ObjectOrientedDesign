
import java.util.Scanner;
import java.util.Random;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class ComboLockTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ComboLockTest
{
    /** description of instance variable x (add comment for each instance variable) */
    
    /**
     * Default constructor for objects of class ComboLockTest
     */
    public ComboLockTest()
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
    public void testComboLock()
    {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int secret1 = random.nextInt(40);
        int secret2 = random.nextInt(40);
        int secret3 = random.nextInt(40);
        System.out.println(secret1);
        System.out.println(secret2);
        System.out.println(secret3);
        ComboLock lock = new ComboLock(secret1, secret2, secret3);
        System.out.print("How many ticks do you want to turn it to the right?: ");
        int ticks = in.nextInt();
        lock.turnRight(ticks);
        System.out.print("How many ticks do you want to turn it to the left?: ");
        ticks = in.nextInt();
        lock.turnLeft(ticks);
        System.out.print("How many ticks do you want to turn it to the right?: ");
        ticks = in.nextInt();
        lock.turnRight(ticks);
        boolean open = lock.open();
        assertEquals(open,true);
    }

}
