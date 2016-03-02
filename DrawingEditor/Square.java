import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.geom.Rectangle2D;
import java.awt.Graphics2D;
public class Square extends Shape
{
    private Rectangle2D.Double square;
    public Square(Point2D.Double center, double radius, Color color)
    {
        super(center,radius,color);
    }
    
    public void draw(Graphics2D g2, boolean filled)
    {
        square = new Rectangle2D.Double(getCenter().getX() - getRadius(), getCenter().getY() - getRadius(), getRadius()*2, getRadius()*2);
        g2.setColor(getColor());
        g2.draw(square);
        g2.fill(square);
    }
}