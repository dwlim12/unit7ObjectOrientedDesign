
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
    
    public int getNum()
    {
        return num;
    }
    
    public int getPin()
    {
        return pin;
    }
    
    public String format()
    {
        return "Card #: " + num + " PIN: " + pin;
    }
    
    public boolean equals(CallingCard card)
    {
        return num == card.getNum() && pin == card.getPin();
    }
}
