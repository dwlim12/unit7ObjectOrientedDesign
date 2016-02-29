import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
/**
 * Write a description of abstract class Shape here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Shape
{
    
    public Shape(Point2D.Double center, double radius, Color color)
    {
        
    }
    
//     public abstract Point2D.Double getCenter()
//     {
//     }
//     public abstract double getRadius()
//     {
//     }
//     public abstract void move(double x, double y)
//     {
//     }
//     public abstract void setRadius(double r)
//     {
//     }
    
    public abstract boolean isInside(Point2D.Double point);
    public abstract boolean isOnBorder(Point2D.Double point);
    public abstract void draw(Graphics2D g2, boolean filled);

}
