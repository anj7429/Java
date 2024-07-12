import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
class KbAdapter extends Frame {
  String msg=" ";
  KbAdapter(){
    addKeyListener(new Mykey());
    addWindowListener(new MyWindowAdapter());
  }
   public void paint(Graphics g){
     g.drawString(msg,80,100);
    }
   public static void main(String args[]){
     KbAdapter obj=new KbAdapter();
     obj.setVisible(true);
     obj.setTitle("Typing");
     obj.setSize(1000,1000);
    }
   class Mykey extends KeyAdapter{
     public void keyTyped(KeyEvent e){
      msg+=e.getKeyChar();
     }
    }
    class MyWindowAdapter extends WindowAdapter{
     public void windowClosing(WindowEvent e){
      System.exit(0);
     }
    }
}