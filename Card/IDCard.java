
public class IDCard extends Card
{
   private String idNumber;
   private String name;
    public IDCard(String n, String id)
   {
        super(n);
        idNumber = id;
        name = n;
   }
    
   public String format()
   {
      return "Card holder: " + name + " ID Number: " + idNumber;
   }
}