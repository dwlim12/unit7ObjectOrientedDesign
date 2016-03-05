import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JColorChooser;
public class DrawingPanel extends JPanel
{
    ArrayList<Shape> shapes;
    Shape activeShape;
    Color color;
    public DrawingPanel()
    {
        this.setBackground(Color.WHITE);
        this.color = Color.RED;
        this.shapes = new ArrayList<Shape>();
    }
    public class MousePressListener implements MouseListener
    {
        public void mousePressed(MouseEvent event) 
        {
//             int x = event.getX();
//             int y = event.getY();
//             Point2D.Double clickpoint = new Point2D.Double(x,y);
//             for (Shape shape : shapes)
//             {
//                 if (shape.isInside(clickpoint))
//                 {
//                     
//                 }
//             }
            
        }
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
        Point2D.Double center = new Point2D.Double(200,100);
        Circle circle = new Circle(center,50,this.color);
        shapes.add(circle);
    }
    
    public void addSquare()
    {
        Point2D.Double center = new Point2D.Double(200,100);
        Square square = new Square(center,50,this.color);
        shapes.add(square);
    }
     
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        Point2D.Double center = new Point2D.Double(250,150);
        Square square = new Square(center,50,this.color);
        square.draw(g2, true);
    }
}