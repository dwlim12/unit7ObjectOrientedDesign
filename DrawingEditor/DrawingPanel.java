import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JComponent;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JColorChooser;
/**
 * Write a description of class DrawingPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawingPanel extends JPanel
{
    JPanel panel;
    ArrayList<Shape> shapes;
    Color color;
    public DrawingPanel()
    {
        this.setBackground(Color.WHITE);
    }
    class MousePressListener implements MouseListener
    {
        public void mousePressed(MouseEvent event) {}
        public void mouseReleased(MouseEvent event) {}
        public void mouseClicked(MouseEvent event) {}
        public void mouseEntered(MouseEvent event) {}
        public void mouseExited(MouseEvent event) {}
    }
    class MouseMoveListener implements MouseMotionListener
    {
        public void mouseDragged(MouseEvent event) {}
        public void mouseMoved(MouseEvent event) {}
    }
    
    public Color getColor()
    {
        return this.color;
    }
    
    public void pickColor()
    {
        //sets and displays color chooser panel
        JFrame frame = new JFrame("ColorChooserDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JComponent newContentPane = new JColorChooser();
        newContentPane.setOpaque(true);
        frame.setContentPane(newContentPane);
        
        frame.pack();
        frame.setVisible(true);
        
        //adds the buttons to select color or cancel
        BorderLayout layout = new BorderLayout();
        frame.setLayout(layout);
        JPanel buttonPanel = new JPanel();
        JButton button1 = new JButton("Ok");
        JButton button2 = new JButton("Cancel");
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        frame.add(buttonPanel,BorderLayout.SOUTH);
    }
    
    public void addCircle()
    {
    }
    
    public void addSquare()
    {
    }
}