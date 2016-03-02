import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.geom.Rectangle2D;
import java.awt.Graphics2D;
public class Square extends Shape
{
    private Rectangle2D square;
    private Point2D center;
    private double radius;
    private Color color;
    public Square(Point2D.Double center, double radius, Color color)
    {
        super(center,radius,color);
    }
    
    public void draw(Graphics2D g2, boolean filled)
    {
        square = new Rectangle2D.Double(250,150,100,100);
        g2.setColor(color);
        g2.draw(square);
        g2.fill(square);
    }
}