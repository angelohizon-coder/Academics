import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUIExer2_Hizon
{
	// Containers
	private JFrame f;
	private JPanel p1, p2, p3, p4, p5, p6, p7;

	// Compartments
	private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11;
	private JLabel l1;
	private JCheckBox c1, c2, c3, c4;


	public GUIExer2_Hizon()
	{
		f = new JFrame("Layout Question");

		GridBagConstraints c = new GridBagConstraints();

		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();
		p5 = new JPanel();
		p6 = new JPanel();
		p7 = new JPanel();

		b1 = new JButton("Hi");
		b1.setPreferredSize(new Dimension(110, 25));
		b2 = new JButton("Long Name");
		b2.setPreferredSize(new Dimension(110, 25));
		b3 = new JButton("Bye");
		b3.setPreferredSize(new Dimension(110, 25));
		b4 = new JButton("1");
		b5 = new JButton("2");
		b6 = new JButton("3");
		b7 = new JButton("4");
		b8 = new JButton("5");
		b9 = new JButton("6");
		b10 = new JButton("7");
		b11 = new JButton("Cancel");

		l1  = new JLabel("Buttons");
	
		c1 = new JCheckBox("Bold");
		c2 = new JCheckBox("Italic");
		c3 = new JCheckBox("Underline");
		c4 = new JCheckBox("Striekout");

		f.addWindowListener(new MyCloseButtonHandler());
	}

	public void launchFrame()
	{
		p1.setLayout(new FlowLayout());
		p1.add(l1);
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);

		p2.setLayout(new GridLayout(4,1));
		p2.add(c1);
		p2.add(c2);
		p2.add(c3);
		p2.add(c4);

		p3.setLayout(new GridLayout(2,2));
		p3.add(b6);
		p3.add(b7);
		p3.add(b8);
		p3.add(b9);

		p4.setLayout(new GridLayout(2,2));
		p4.add(b4);
		p4.add(b5);
		p4.add(p3);
		p4.add(b10);

		// Test
		p5.setLayout(new FlowLayout());
		p5.add(p2);
		p5.add(p4);

		f.add(p1, BorderLayout.NORTH);
		f.add(p2, BorderLayout.WEST);
		f.add(p4, BorderLayout.CENTER);
		f.add(b11,BorderLayout.SOUTH);

		f.setSize(420, 250);
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
		GUIExer2_Hizon exerciseTwo = new GUIExer2_Hizon();
		exerciseTwo.launchFrame();
	}
}