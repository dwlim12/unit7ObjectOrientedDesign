

/**
 * Write a description of class ComboLock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ComboLock
{
    /** description of instance variable x (add comment for each instance variable) */
    private int num;
    private int[] combo;
    private int dial;
    private boolean[] correct;

    /**
     * Default constructor for objects of class ComboLock
     */
    public ComboLock(int secret1, int secret2, int secret3)
    {
        combo = new int[3];
        combo[0] = secret1;
        combo[1] = secret2;
        combo[2] = secret3;
        dial = 0;
        correct = new boolean[3];
    }

    public void reset()
    {
        if (dial != 0)
        {
            dial = 0;
        }
        for (int i = 0; i < 3; i++)
        {
            correct[i] = false;
        }
    }
    
    public void turnLeft(int ticks)
    {
        if (dial >= ticks)
        {
            dial -= ticks;
        }
        else
        {
            dial = 40 - (ticks - dial);
        }
        if (dial == combo[1] && correct[0] == true)
        {
            correct[1] = true;
        }
        //fix
        else if (dial != combo[1])
        {
            correct[0] = false;
        }
    }
    
    public void turnRight(int ticks)
    {
        if ((dial + ticks) < 40)
        {
            dial += ticks;
        }
        else
        {
            dial = ticks + dial - 40;
        }
        if (dial == combo[0])
        {
            correct[0] = true;
        }
        else if (dial == combo[2] && correct[0] == true && correct[1] == true)
        {
            correct[2] = true;
        }
        else
        {
            for (int i = 0; i < 3; i++)
            {
                correct[i] = false;
            }
        }
    }
    
    public boolean open()
    {
        if (correct[0] == true && correct[1] == true && correct[2] == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }


}
