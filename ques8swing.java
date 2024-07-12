import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MouseEventDemo extends JFrame implements MouseListener{

    public MouseEventDemo() {
        addMouseListener(this);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    // Handle mouse entered
    public void mouseEntered(MouseEvent me) {
        setSize(new Dimension(900, 900));
    }

    // Handle mouse clicked
    public void mouseClicked(MouseEvent me) {
        setSize(new Dimension(300, 300));
    }

    // Handle mouse exited
    public void mouseExited(MouseEvent me) {
        System.exit(0);
    }

    // Handle mouse Pressed
    public void mousePressed(MouseEvent me) {
    }

    // Handle mouse Released
    public void mouseReleased(MouseEvent me) {
    }

}

public class ques8swing{
    public static void main(String[] args) {
        MouseEventDemo ob = new MouseEventDemo();
        ob.setSize(new Dimension(300, 300));
        ob.setTitle("Q8 java frame");
        ob.setVisible(true);
    }
}
