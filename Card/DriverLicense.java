
public class DriverLicense
{
    private String name;
    private int exp_date;
    public DriverLicense(String n, int year)
    {
        super(n);
        exp_date = year;
        name = n;
    }
    
    public String format()
    {
        return "name: " + name + " Expiration date: " + exp_date;
    }
    
}
