import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
public class MouseEventsDemo extends Frame implements MouseListener
{
String s=" ";
int mouseX=0,mouseY=0;
static int l,b;
public MouseEventsDemo()
{
addMouseListener(this);
addWindowListener(new WindowAdapter()
{
public void windowClosing(MouseEvent me)
{
System.exit(0);
}
});
}
public void mouseEntered(MouseEvent me)
{
setSize(new Dimension(3*l,3*b));
s="MOUSE ENTERED HERE";
repaint();
}
public void mouseClicked(MouseEvent me)
{
setSize(new Dimension(l,b));
s=s+" MOUSE CLICKED ";
repaint();
}
public void mouseExited(MouseEvent me)
{
System.exit(0);
}
public void mousePressed(MouseEvent me)
{
mouseX=me.getX();
mouseY=me.getY();
repaint();
}
public void mouseReleased(MouseEvent me)
{
mouseX=me.getX();
mouseY=me.getY();
repaint();
}
public void paint(Graphics g)
{
g.drawString(s,mouseX,mouseY);
}
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter the values of l and b:");
l=sc.nextInt();
b=sc.nextInt();
MouseEventsDemo ob=new MouseEventsDemo();
ob.setSize(l,b);
ob.setTitle("  MouseEventsDemo ");
ob.setVisible(true);
}
}