import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;
public class TriangleComponent extends JComponent
{
    private Ellipse2D dot;
    private Line2D line1;
    private Line2D line2;
    private Line2D line3;
    public int count;
    /**
     * Default constructor for objects of class DrawTriangle
     */
    public TriangleComponent()
    {
        dot = new Ellipse2D.Double();
        line1 = new Line2D.Double();
        line2 = new Line2D.Double();
        line3 = new Line2D.Double();
        count = 0;
    }
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        if (this.count > 0)
        {g2.draw(dot);
         g2.fill(dot);}
        if (this.count > 1)
        {g2.draw(line1);}
        if (this.count > 2)
        {g2.draw(line2);
         g2.draw(line3);}
    }
    
    public void addPoint()
    {
        if (count < 3)
        {count++;}
        else
        {
            count = 0;
            count ++;
        }
    }
    
    public void drawDot(int x, int y)
    {
        dot.setFrame(x,y,5,5);
        repaint();
    }
    
    public void drawLine(int x, int y, int a, int b)
    {
        line1.setLine(x,y,a,b);
        repaint();
    }
    
    public void drawTriangle(int x, int y, int a, int b, int c, int d)
    {
        line2.setLine(x,y,c,d);
        line3.setLine(a,b,c,d);
        repaint();
    }
}
