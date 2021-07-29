import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class GUIExer2_Hizon
{
	// Containers
	private JFrame f;
	private JPanel p1, p2, p3, p4;

	// Compartments
	private JButton b1, b2, b3, b4, b5, b6, b7, hi, longName, bye, cancel;
	private JLabel l1;
	private JCheckBox c1, c2, c3, c4;

	public GUIExer2_Hizon()
	{
		f = new JFrame("Good Thing I Studied!");

		GridBagConstraints c = new GridBagConstraints();

		p1 = new JPanel(new GridBagLayout());
		c.insets = new Insets(3,3,3,3);
		l1 = new JLabel("Buttons: ");
		c.gridx = 0;
		c.gridy = 0;
		p1.add(l1, c);
		hi = new JButton("Hi");
		c.gridx = 1;
		c.gridy = 0;
		hi.setPreferredSize(new Dimension(100, 25));
		p1.add(hi, c);
		longName = new JButton("Long Name");
		c.gridx = 2;
		c.gridy = 0;
		longName.setPreferredSize(new Dimension(100, 25));
		p1.add(longName, c);
		bye = new JButton("Bye");
		c.gridx = 3;
		c.gridy = 0;
		bye.setPreferredSize(new Dimension(100, 25));
		p1.add(bye, c);
		f.getContentPane().add(p1, BorderLayout.NORTH);

		p2 = new JPanel(new GridBagLayout());
		c1 = new JCheckBox("Bold");
		c.gridx = 0;
		c.gridy = 0;
		c.anchor = GridBagConstraints.WEST;
		p2.add(c1, c);
		c2 = new JCheckBox("Italic");
		c.gridx = 0;
		c.gridy = 1;
		c.anchor = GridBagConstraints.WEST;
		p2.add(c2, c);
		c3 = new JCheckBox("Underline");
		c.gridx = 0;
		c.gridy = 2;
		c.anchor = GridBagConstraints.WEST;
		p2.add(c3, c);
		c4 = new JCheckBox("StrikeOut");
		c.gridx = 0;
		c.gridy = 3;
		c.anchor = GridBagConstraints.WEST;
		p2.add(c4, c);
		f.getContentPane().add(p2, BorderLayout.WEST);

		p3 = new JPanel(new GridBagLayout());
		b1 = new JButton("1");
		c.gridx = 0;
		c.gridy = 0;
		p3.add(b1, c);
		b2 = new JButton("2");
		c.gridx = 3;
		c.gridy = 0;
		p3.add(b2, c);
		b3 = new JButton("3");
		c.gridx = 0;
		c.gridy = 2;
		p3.add(b3, c);
		b4 = new JButton("4");
		c.gridx = 1;
		c.gridy = 2;
		p3.add(b4, c);
		b5 = new JButton("5");
		c.gridx = 0;
		c.gridy = 3;
		p3.add(b5, c);
		b6 = new JButton("6");
		c.gridx = 1;
		c.gridy = 3;
		p3.add(b6, c);
		b7 = new JButton("7");
		c.gridx = 3;
		c.gridy = 3;
		p3.add(b7, c);
		f.getContentPane().add(p3, BorderLayout.CENTER);

		p4 = new JPanel(new GridBagLayout());
		cancel = new JButton("Cancel");
		c.gridx = 0;
		c.gridy = 0;
		cancel.setPreferredSize(new Dimension(350, 25));
		p4.add(cancel, c);
		f.getContentPane().add(p4, BorderLayout.SOUTH);


		f.setSize(420, 250);
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
		GUIExer2_Hizon exerciseTwo = new GUIExer2_Hizon();
	}
}