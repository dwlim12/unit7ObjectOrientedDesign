import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.Color;
public class Circle extends Shape
{
    private Ellipse2D circle;
    public Circle(Point2D.Double center, double radius, Color color)
    {
        super(center,radius,color);
    }
    
    void draw(Graphics2D g2, boolean filled)
    {
        
    }
}
