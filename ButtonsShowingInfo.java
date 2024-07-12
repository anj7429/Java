import java.awt.*;
import java.awt.event.*;

public class ButtonsShowingInfo extends Frame implements ActionListener
{
	Button a, b;
	String str = "";
	String N = "";
	String R = "";
	String C = "";
	String S = "";

	public ButtonsShowingInfo()
	{
		setLayout(new FlowLayout());
	
		a = new Button(" A ");
		a.addActionListener(this);
		add(a);

		b = new Button(" B ");
		b.addActionListener(this);
		add(b);

		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
	
	public void actionPerformed(ActionEvent ae)	
	{
		if(ae.getSource() == a)
		{
			str = " Name :  \n Course : B.Sc(Hons)Computer Science. \n Roll no :  \n College : Dyal Singh College (day). ";
		}

		else
		{
			str = " CGPA : ";
		}
		
		repaint();
	}

	public void paint(Graphics g)
	{
        	g.drawString(str, 120, 180);
	}

	public static void main(String[] args)
	{
		ButtonsShowingInfo ob = new ButtonsShowingInfo();

		ob.setSize(new Dimension(1800, 300));
		ob.setTitle(" Buttons Showing Information ");
		ob.setVisible(true);
	}
}