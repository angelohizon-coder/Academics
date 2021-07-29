import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUIExer4_Hizon
{
	// Containers
	private JFrame f;
	private JPanel p1, p2, p3, p4, p5, p6;

	// Compartments
	private JButton b1, b2, b3, b4, b5, b6, b7, b8;
	private JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9;
	private JTextField tf1;

	public GUIExer4_Hizon()
	{
		f = new JFrame("I Dig Layout");

		GridBagConstraints c = new GridBagConstraints();

		c.insets = new Insets(0, 0, 0, 0);

		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();
		p5 = new JPanel();
		p6 = new JPanel();

		b1 = new JButton("1");
		b1.setPreferredSize(new Dimension(50, 25));
		b2 = new JButton("2");
		b2.setPreferredSize(new Dimension(400, 25));
		b3 = new JButton("3");
		b3.setPreferredSize(new Dimension(400, 25));
		b5 = new JButton("5");
		b5.setPreferredSize(new Dimension(200, 25));
		b6 = new JButton("6");
		b7 = new JButton("7");

		b4 = new JButton("4");
		b4.setPreferredSize(new Dimension(200, 25));
		b8 = new JButton("8");
		b8.setPreferredSize(new Dimension(200, 25));

		l1  = new JLabel("Pretty Tricky!");
		l2  = new JLabel("                 ");
		l3  = new JLabel("                 ");
		l4  = new JLabel("                                                                                                   ");
		tf1 = new JTextField("", 29);
		tf1.setPreferredSize(new Dimension(50, 25));

		p1.add(b2);

		p2.add(b1);
		p2.add(tf1);

		p3.add(b3);

		p4.add(b4);
		p4.add(b5);

		p5.add(l2);
		p5.add(b6);
		p5.add(b7);
		p5.add(l3);
		p5.add(b8);

		p6.add(l1);
		p6.add(l4);

		f.setLayout(new FlowLayout());

		f.add(p1);
		f.add(p2);
		f.add(p3);
		f.add(p4);
		f.add(p5);
		f.add(p6);

		f.setSize(400, 300);
		f.setVisible(true);

		f.addWindowListener(new MyCloseButtonHandler());
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
	}
}
