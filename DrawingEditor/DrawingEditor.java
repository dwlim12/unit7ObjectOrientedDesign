import javax.swing.JFrame;
import java.awt.BorderLayout;
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
    BorderLayout layout;
    public DrawingEditor()
    {
        this.setTitle("Drawing Editor");
        canvas = new DrawingPanel();
        controls = new ControlPanel(canvas);
        layout = new BorderLayout();
        this.setLayout(layout);
        this.add(controls, BorderLayout.SOUTH);
        this.add(canvas);
        this.setSize(600,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    public static void main(String[] args)
    {
        DrawingEditor editor = new DrawingEditor();
    }

}
