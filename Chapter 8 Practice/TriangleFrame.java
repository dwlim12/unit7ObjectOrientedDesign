import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import java.util.ArrayList;
public class TriangleFrame extends JFrame
{
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 400;
    private TriangleComponent scene;
    private ArrayList<Integer> points;
    private int count;
    
    class MousePressListener implements MouseListener
    {
        public void mousePressed(MouseEvent event)
        {
            int x = event.getX();
            int y = event.getY();
            points.add(x);
            points.add(y);
            scene.addPoint();
            if (scene.count > 0)
            {scene.drawDot(x,y);}
            if (scene.count > 1)
            {scene.drawLine(points.get(0),points.get(1),x,y);}
            if (scene.count > 2)
            {scene.drawTriangle(points.get(0),points.get(1),points.get(2),points.get(3),x,y);}
        }
        public void mouseReleased(MouseEvent event) {}
        public void mouseClicked(MouseEvent event) {}
        public void mouseEntered(MouseEvent event) {}
        public void mouseExited(MouseEvent event) {}
    }
    
    public TriangleFrame()
    {
        points = new ArrayList<Integer>(6);
        count = 0;
        
        scene = new TriangleComponent();
        add(scene);
        
        MouseListener listener = new MousePressListener();
        scene.addMouseListener(listener);
        
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }
}
