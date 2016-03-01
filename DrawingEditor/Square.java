import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.geom.Rectangle2D;
public class Square extends Shape
{
    private Rectangle2D square;
    public Square(Point2D.Double center, double radius, Color color)
    {
        super(center,radius,color);
    }
    
    public void draw(Graphics2D g2, boolean filled)
    {
        square = new Rectangle2D();
        square.setRect(
    }
}