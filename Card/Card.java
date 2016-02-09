public class Card
{
   private String name;

   public Card()
   {
      name = "";
   }

   public Card(String n)
   {
      name = n;
   }

   public String getName()
   {
      return name;
   }

   public boolean isExpired()
   {
      return false;
   }

   public String format()
   {
      return "Card holder: " + name;
   }
   
   public boolean equals(Card card)
   {
       if (this.getClass() == card.getClass())
       {
           return name.equals(card.getName());
        }
       else
       {
           return false;
       }
   }
}