import java.util.GregorianCalendar;
public class DriversLicense extends Card
{
    private String name;
    private int exp_date;
    public DriversLicense(String n, int year)
    {
        super(n);
        exp_date = year;
        name = n;
    }
    
    public String format()
    {
        return "Card holder: " + name + " Expiration date: " + exp_date;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getExpDate()
    {
        return exp_date;
    }
    
    public boolean isExpired()
    {
        GregorianCalendar calendar = new GregorianCalendar();
        if (exp_date < calendar.get(calendar.YEAR))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean equals(DriversLicense card)
    {
        return name.equals(card.getName()) && exp_date == card.getExpDate();
    }
}
