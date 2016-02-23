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
    
    /**
     * An example of an abstract method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public abstract int sampleAbstractMethod(int y);

}
