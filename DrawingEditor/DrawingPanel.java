import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JComponent;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
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
    ArrayList<Shape> shapes;
    Shape shape;
    Color color;
    Color newColor;
    JFrame frame;
    JColorChooser colorChooser;
    public DrawingPanel()
    {
        this.setBackground(Color.WHITE);
        this.color = Color.ORANGE;
        this.newColor = Color.WHITE;
        this.shapes = new ArrayList<Shape>();
    }
    public class MousePressListener implements MouseListener
    {
        public void mousePressed(MouseEvent event) {}
        public void mouseReleased(MouseEvent event) {}
        public void mouseClicked(MouseEvent event) {}
        public void mouseEntered(MouseEvent event) {}
        public void mouseExited(MouseEvent event) {}
    }
    public class MouseMoveListener implements MouseMotionListener
    {
        public void mouseDragged(MouseEvent event) {}
        public void mouseMoved(MouseEvent event) {}
    }
    public class ColorListener implements ChangeListener
    {
        public void stateChanged(ChangeEvent e)
        {
            newColor = colorChooser.getColor();
            color = newColor;
        }
    }
    public class ClickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            if (event.getActionCommand().equals("Select"))
            {
                color = newColor;
                frame.setVisible(false);
            }
            else if (event.getActionCommand().equals("Cancel"))
            {
                color = color;
                frame.setVisible(false);
            }
        }
    }
    
    public Color getColor()
    {
        return this.color;
    }
    
    public void pickColor()
    {
        //sets and displays color chooser panel
        frame = new JFrame("ColorChooserDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ColorListener colorlistener = new ColorListener();
        
        colorChooser = new JColorChooser();
        colorChooser.setOpaque(true);
        colorChooser.getSelectionModel().addChangeListener(colorlistener);
        frame.setContentPane(colorChooser);
        
        frame.pack();
        frame.setVisible(true);
        
        //adds the buttons to select color or cancel
        BorderLayout layout = new BorderLayout();
        frame.setLayout(layout);
        JPanel buttonPanel = new JPanel();
        JButton button1 = new JButton("Select");
        JButton button2 = new JButton("Cancel");
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        frame.add(buttonPanel,BorderLayout.SOUTH);
        ClickListener listener1 = new ClickListener();
        ClickListener listener2 = new ClickListener();
        button1.addActionListener(listener1);
        button2.addActionListener(listener2);
    }
    
    public void addCircle()
    {
    }
    
    public void addSquare()
    {
    }
}