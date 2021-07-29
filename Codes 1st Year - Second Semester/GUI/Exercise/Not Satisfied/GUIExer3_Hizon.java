import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUIExer3_Hizon
{
	// Containers
	private JFrame f;
	private JPanel p1, p2, p3, p4;

	// Compartments
	private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;
	private JLabel l1, l2, l3, l4, l5;
	private JTextField tf1;

	public GUIExer3_Hizon()
	{
		f = new JFrame("Midterm on Thursday!");

		GridBagConstraints c = new GridBagConstraints();

		p1 = new JPanel(new GridBagLayout());
		b1 = new JButton("Now Playing");
		c.gridx = 0;
		c.gridy = 0;
		c.anchor = GridBagConstraints.WEST;
		p1.add(b1,c);
		b2 = new JButton("Media Guide");
		c.gridx = 0;
		c.gridy = 1;
		c.anchor = GridBagConstraints.WEST;
		p1.add(b2,c);
		b3 = new JButton("Library");
		c.gridx = 0;
		c.gridy = 2;
		c.anchor = GridBagConstraints.WEST;
		p1.add(b3,c);
		b4 = new JButton("Help & Info");
		c.gridx = 0;
		c.gridy = 3;
		c.anchor = GridBagConstraints.WEST;
		p1.add(b4,c);
		b5 = new JButton("Services");
		c.gridx = 0;
		c.gridy = 4;
		c.anchor = GridBagConstraints.WEST;
		p1.add(b5,c);
		f.getContentPane().add(p1, BorderLayout.WEST);

		p2 = new JPanel(new GridBagLayout());
		tf1 = new JTextField("", 10);
		tf1.setPreferredSize(new Dimension(40, 200));
		c.gridx = 0;
		c.gridy = 0;
		c.anchor = GridBagConstraints.NORTH;
		p2.add(tf1,c);
		f.getContentPane().add(p2, BorderLayout.CENTER);

		p3 = new JPanel(new GridBagLayout());
		b6 = new JButton("  0  ");
		c.gridx = 0;
		c.gridy = 0;
		c.anchor = GridBagConstraints.EAST;
		p3.add(b6,c);
		b7 = new JButton("  1  ");
		c.gridx = 1;
		c.gridy = 0;
		c.anchor = GridBagConstraints.EAST;
		p3.add(b7,c);
		b8 = new JButton("  2  ");
		c.gridx = 0;
		c.gridy = 1;
		c.anchor = GridBagConstraints.EAST;
		p3.add(b8,c);
		b9 = new JButton("  3  ");
		c.gridx = 1;
		c.gridy = 1;
		c.anchor = GridBagConstraints.EAST;
		p3.add(b9,c);
		b10 = new JButton("OK");
		c.gridx = 0;
		c.gridy = 2;
		c.anchor = GridBagConstraints.EAST;
		p3.add(b10,c);
		f.getContentPane().add(p3, BorderLayout.EAST);

		p4 = new JPanel(new GridBagLayout());
		c.insets = new Insets(4, 4, 4, 4);
		l1 = new JLabel("Movies");
		c.gridx = 0;
		c.gridy = 0;
		p4.add(l1, c);
		l2 = new JLabel("Music");
		c.gridx = 1;
		c.gridy = 0;
		p4.add(l2,c);
		l3 = new JLabel("Videos");
		c.gridx = 2;
		c.gridy = 0;
		p4.add(l3,c);
		l4 = new JLabel("DVD");
		c.gridx = 3;
		c.gridy = 0;
		p4.add(l4,c);
		l5 = new JLabel("Web Pages");
		c.gridx = 4;
		c.gridy = 0;
		p4.add(l5,c);
		f.getContentPane().add(p4, BorderLayout.SOUTH);
	


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
		GUIExer3_Hizon exerciseThree = new GUIExer3_Hizon();
	}
}