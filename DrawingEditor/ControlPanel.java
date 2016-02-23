import javax.swing.JButton;
import javax.swing.JPanel;
/**
 * Write a description of class ControlPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ControlPanel extends JPanel
{
    private JPanel panel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    public ControlPanel(DrawingPanel canvas)
    {
        this.panel = new JPanel();
        this.button1 = new JButton("Pick Color");
        this.button2 = new JButton("Add Circle");
        this.button3 = new JButton("Add Square");
        this.panel.add(button1);
        this.panel.add(button2);
        this.panel.add(button3);
    }
    
    public JPanel getPanel()
    {
        return this.panel;
    }
}
