import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;
public class TriangleComponent extends JComponent
{
    private Ellipse2D dot;
    /**
     * Default constructor for objects of class DrawTriangle
     */
    public TriangleComponent()
    {
        dot = new Ellipse2D.Double();
    }
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(dot);
        g2.fill(dot);
    }
    
    public void drawDot(int x, int y)
    {
        dot.setFrame(x,y,5,5);
        repaint();
    }
    
    public void drawLine(int x, int y, int a, int b)
    {
        
    }
}
