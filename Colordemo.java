import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
public class Colordemo extends Frame
{
public Colordemo()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the values of l and b : ");
int l=sc.nextInt();
int b=sc.nextInt();
setSize(l,b);
setTitle("Color Window");
setVisible(true);
setBackground(Color.pink);
setForeground(Color.green);
addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent me)
{
System.exit(0);
}
});
}
public void paint(Graphics g)
{
g.drawString("Program",300,300);
}
public static void main(String a[])
{
Colordemo ob=new Colordemo();
}
}