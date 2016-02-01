
public class ChoiceQuestion extends Question
{
   private int numberOfChoices;
   public ChoiceQuestion()
   {
       super();
       numberOfChoices = 0;
   }
   
   public void addChoice(String choice, boolean correct)
   {
       numberOfChoice++;
       this.addText("\n" + number of choices + ")" 
       
       if (correct)
       {
           String choiceString = "" + numberOfChoices;
           this.setAnswer(choiceString);
       }
   }
}
