import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUIExer4_Hizon
{
	// Containers
	private JFrame f;
	private JPanel p1, p2, p3, p4, p5, p6, p7;

	// Compartments
	private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;
	private JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9;
	private JTextField tf1;

	public GUIExer4_Hizon()
	{
		f = new JFrame("I Dig Layout");

		GridBagConstraints c = new GridBagConstraints();

		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();
		p5 = new JPanel();
		p6 = new JPanel();

		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");

		l1 = new JLabel("Pretty Tricky!");
		l2 = new JLabel("");
		l3 = new JLabel("");
		l4 = new JLabel("");
		l5 = new JLabel("");
		l6 = new JLabel("");
		l7 = new JLabel("");
		l8 = new JLabel("");
		l9 = new JLabel("");

		tf1 = new JTextField("text", 29);
		tf1.setPreferredSize(new Dimension(0, 25));

		f.addWindowListener(new MyCloseButtonHandler());
	}

	public void launchFrame()
	{
		p1.setLayout(new FlowLayout());
		p1.add(b1);
		p1.add(tf1);

		p2.setLayout(new GridLayout(3,1));
		p2.add(b2);
		p2.add(p1);
		p2.add(b3);

		p3.setLayout(new GridLayout(3,1));
		p3.add(l2);
		p3.add(l3);
		p3.add(b5);

		p4.setLayout(new GridLayout(2, 4));
		p4.add(l4);
		p4.add(b6);
		p4.add(b7);
		p4.add(l5);
		p4.add(l6);
		p4.add(l7);
		p4.add(l8);
		p4.add(l9);

		p5.setLayout(new GridLayout(2,2));
		p5.add(b4);
		p5.add(p3);
		p5.add(p4);
		p5.add(b8);

		f.add(p2, BorderLayout.NORTH);
		f.add(p5, BorderLayout.CENTER);
		f.add(l1, BorderLayout.SOUTH);

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
		GUIExer4_Hizon exerciseFour = new GUIExer4_Hizon();
		exerciseFour.launchFrame();
	}
}