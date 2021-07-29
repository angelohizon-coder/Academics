import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUIExer3_Hizon
{
	// Containers
	private JFrame f;
	private JPanel p1, p2, p3, p4, p5, p6, p7;

	// Compartments
	private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;
	private JLabel l1, l2, l3, l4, l5;
	private JTextField tf1;

	public GUIExer3_Hizon()
	{
		f = new JFrame("Midterm on Thursday!");

		GridBagConstraints c = new GridBagConstraints();

		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();
		p5 = new JPanel();
		p6 = new JPanel();
		p7 = new JPanel();

		b1 = new JButton("Now Playing");
		b1.setPreferredSize(new Dimension(30, 25));
		b2 = new JButton("Media Guidline");
		b2.setPreferredSize(new Dimension(30, 25));
		b3 = new JButton("Library");
		b3.setPreferredSize(new Dimension(30, 25));
		b4 = new JButton("Help & Info");
		b4.setPreferredSize(new Dimension(30, 25));
		b5 = new JButton("Services");
		b5.setPreferredSize(new Dimension(30, 25));
		b6 = new JButton("0");
		b7 = new JButton("1");
		b8 = new JButton("2");
		b9 = new JButton("3");
		b10 = new JButton("OK");

		c.insets = new Insets(10,10,10,10);
		l1  = new JLabel("Movies");
		l2  = new JLabel("Music");
		l3  = new JLabel("Videos");
		l4  = new JLabel("DVD");
		l5  = new JLabel("Web Pages");

		tf1 = new JTextField("", 13);
		tf1.setPreferredSize(new Dimension(0, 250));

		f.addWindowListener(new MyCloseButtonHandler());
	}

	public void launchFrame()
	{
		p1.setLayout(new GridLayout(5,1));
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		p1.add(b5);

		p2.add(tf1);

		p3.setLayout(new GridLayout(2,1));
		p3.add(p1);

		p4.setLayout(new GridLayout(1,2));
		p4.add(p3);
		p4.add(tf1);

		p5.setLayout(new GridLayout(2,2));
		p5.add(b6);
		p5.add(b7);
		p5.add(b8);
		p5.add(b9);

		p6.setLayout(new GridLayout(2,1));
		p6.add(p5);
		p6.add(b10);

		p7.setLayout(new FlowLayout());
		p7.add(l1);
		p7.add(l2);
		p7.add(l3);
		p7.add(l4);
		p7.add(l5);

		f.add(p4, BorderLayout.WEST);	
		f.add(p6, BorderLayout.EAST);
		f.add(p7, BorderLayout.SOUTH);

		f.setSize(400, 300);
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
		GUIExer3_Hizon exerciseThree = new GUIExer3_Hizon();
		exerciseThree.launchFrame();
	}
}