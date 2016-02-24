import javax.swing.JPanel;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
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
}