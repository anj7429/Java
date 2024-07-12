import java.awt.*;
import java.awt.event.*;
public class PressButton extends Frame implements ActionListener
{
Button red,blue;
public PressButton()
{
String s=" ";
red=new Button("Red");
blue=new Button("Blue");
setLayout(new FlowLayout());
add(red);
add(blue);
red.addActionListener(this);
blue.addActionListener(this);
red.setBackground(Color.red);
blue.setBackground(Color.blue);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==red)
{
setBackground(Color.red);
}
else
{
setBackground(Color.blue);
}
}
public static void main(String a[])
{
PressButton b=new PressButton();
b.setSize(400,400);
b.setTitle("Press the desired key");
b.setVisible(true);
}
}