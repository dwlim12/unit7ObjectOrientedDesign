import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
/**
 * Write a description of class ControlPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ControlPanel extends JPanel
{
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JPanel colorIndicator;
    public ControlPanel(DrawingPanel canvas)
    {
        this.button1 = new JButton("Pick Color");
        this.button2 = new JButton("Add Circle");
        this.button3 = new JButton("Add Square");
        this.add(button1);
        this.add(button2);
        this.add(button3);
        
        colorIndicator = new JPanel();
        colorIndicator.setBackground(Color.WHITE);
        
        ActionListener listener1 = new ActionListener();
        ActionListener listener2 = new ActionListener();
        ActionListener listener3 = new ActionListener();
        this.button1.addActionListener(listener1);
        this.button2.addActionListener(listener2);
        this.button3.addActionListener(listener3);
    }
        
        public class ClickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            if (event.getActionCommand().equals("Pick Color")
            {
                
            }
            else if (event.getActionCommand().equals("Add Circle")
            {
                
            }
            else if (event.getActionCommand().equals("Add Square")
        }
    }
    
}
