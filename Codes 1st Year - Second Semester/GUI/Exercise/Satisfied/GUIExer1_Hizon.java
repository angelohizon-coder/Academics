import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUIExer1_Hizon
{
	// Containers
	private JFrame f;
	private JPanel p1, p2, p3, p4;

	// Compartments
	private JButton b1, b2, b3, b4, b5, b6, b7;
	private JLabel l1;
	private JTextField tf1;

	public GUIExer1_Hizon()
	{
		f = new JFrame("Good Thing I Studied!");
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();

		b1 = new JButton("Button 1");
		b2 = new JButton("Button 2");
		b3 = new JButton("Button 3");
		b4 = new JButton("Button 4");
		b5 = new JButton("Button 5");
		b6 = new JButton("Button 6");
		b7 = new JButton("Button 7");

		l1  = new JLabel("Type Stuff: ");
		tf1 = new JTextField("", 15);

		f.addWindowListener(new MyCloseButtonHandler());
	}

	public void launchFrame()
	{
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);

		p2.add(b4);
		p2.add(b6);

		p3.add(b5);
		p3.add(b7);

		p4.add(l1);
		p4.add(tf1);

		f.setLayout(new FlowLayout());
		
		f.add(p1);
		f.add(p2);
		f.add(p3);
		f.add(p4);

		f.setSize(285, 200);
		f.setVisible(true);
	}

	private class MyCloseButtonHandler extends WindowAdapter
	{
		public void windowClosing(WindowEvent we)
		{
			System.exit(0);
		}
	}

	public static void main(String args[])
	{
		GUIExer1_Hizon exerciseOne = new GUIExer1_Hizon();
		exerciseOne.launchFrame();
	}
}