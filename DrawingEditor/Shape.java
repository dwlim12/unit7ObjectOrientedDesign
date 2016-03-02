import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
public abstract class Shape
{
    private Point2D center;
    private double radius;
    private Color color;
    public Shape(Point2D.Double center, double radius, Color color)
    {
        this.center = center;
        this.radius = radius;
        this.color = color;
    }
    
//      public Point2D.Double getCenter()
//      {
//          return this.center;
//      }
     public double getRadius()
     {
         return this.radius;
     }
//     public void move(double x, double y)
//     {
//     }
//     public void setRadius(double r)
//     {
//     }
    
    //public abstract boolean isInside(Point2D.Double point);
    //public abstract boolean isOnBorder(Point2D.Double point);
    public abstract void draw(Graphics2D g2, boolean filled);

}
