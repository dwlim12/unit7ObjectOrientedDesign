import javax.swing.JFrame;
/**
 * Write a description of class DrawingEditor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawingEditor extends JFrame
{
    DrawingPanel canvas;
    ControlPanel controls;
    JFrame frame;
    public DrawingEditor()
    {
        frame = new JFrame("Drawing Editor");
        canvas = new DrawingPanel();
        controls = new ControlPanel(canvas);
        this.frame.add(controls.getPanel());
        this.frame.setSize(600,400);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);
    }
    
    public static void main(String[] args)
    {
        DrawingEditor editor = new DrawingEditor();
    }

}
