public class Billfold
{
    /** description of instance variable x (add comment for each instance variable) */
    private Card card1;
    private Card card2;
    /**
     * Default constructor for objects of class Billfold
     */
    public Billfold()
    {
        
    }
    public void addCard(Card card)
    {
        if (card1 == null)
        {
            card1 = card;
        }
        else if (card2 == null)
        {
            card2 = card;
        }
    }
    public void formatCards()
    {
        System.out.println(card1.format() + "\n" + card2.format());
    }
    public int getExpiredCardCount()
    {
        int count = 0;
        if (card1.isExpired() == true)
        {
            count ++;
        }
        if (card2.isExpired() == true)
        {
            count ++;
        }
        return count;
    }
}
