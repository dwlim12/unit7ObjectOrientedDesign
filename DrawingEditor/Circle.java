import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.Graphics2D;
import java.awt.Color;
public class Circle extends Shape
{
    private Ellipse2D.Double circle;
    public Circle(Point2D.Double center, double radius, Color color)
    {
        super(center,radius,color);
    }
    
    public void draw(Graphics2D g2, boolean filled)
    {
        circle = new Ellipse2D.Double(250,150,100,100);
        g2.setColor(color);
        g2.draw(circle);
        g2.fill(circle);
    }
}
