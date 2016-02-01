
public class CallingCard extends Card
{
    private int num;
    private int pin;
    public CallingCard(String n, int card_num, int pin)
    {
        super(n);
        num = card_num;
        this.pin = pin;
    }
    
    public String format()
    {
        return "Card #: " + num + " PIN: " + pin;
    }
}
