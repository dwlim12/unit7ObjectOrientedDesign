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
    ArrayList<Shape> shapes;
    Shape shape;
    Color color;
    public DrawingPanel()
    {
        this.setBackground(Color.WHITE);
        this.color = Color.RED;
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
    
    public Color getColor()
    {
        return this.color;
    }
    
    public void pickColor()
    {
        this.color = JColorChooser.showDialog(this,"Color Chooser",this.color);
    }
    
    public void addCircle()
    {
    }
    
    public void addSquare()
    {
    }
}