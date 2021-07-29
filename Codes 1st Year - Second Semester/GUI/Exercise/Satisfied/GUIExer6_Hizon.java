import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUIExer6_Hizon implements ActionListener
{
	// Containers
	private JFrame f;
	private JPanel p1, p2, p3, p4;

	// Compartments
	private JButton b1, b2;
	private JTextField tf1;

	public GUIExer6_Hizon()
	{
		f = new JFrame("Silly String Game");

		GridBagConstraints c = new GridBagConstraints();
		GridBagLayout layout = new GridBagLayout();  

		p1 = new JPanel();
		
		b1 = new JButton("Uppercase");
		c.fill = GridBagConstraints.HORIZONTAL;  
		c.anchor = GridBagConstraints.WEST; 
        p1.add(b1, c);

        p2 = new JPanel();

        tf1 = new JTextField("The text can be made to all upper case or lower case", 35);
        c.fill = GridBagConstraints.HORIZONTAL;  
        c.anchor = GridBagConstraints.WEST;
        p2.add(tf1, c);

        p3 = new JPanel();

        b2 = new JButton("Lowercase");
        c.fill = GridBagConstraints.HORIZONTAL;  
        c.anchor = GridBagConstraints.WEST;
        p3.add(b2, c);

		f.getContentPane().add(p1, BorderLayout.NORTH);
		f.getContentPane().add(p2, BorderLayout.CENTER);
		f.getContentPane().add(p3, BorderLayout.SOUTH);

		f.pack();
		f.setVisible(true);

		b1.addActionListener(this);
		b2.addActionListener(this);

		f.addWindowListener(new MyCloseButtonHandler());
	}

	public void actionPerformed(ActionEvent ae)
	{
		Object source = ae.getSource();
		String message;

		if(tf1.getText() != null)
		{
			message = tf1.getText();

			if(source == b1)
			{
				message = message.toUpperCase();
			}

			else if(source == b2)
			{
				message = message.toLowerCase();
			}

			else
			{

			}

			tf1.setText(message);
		}
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
		GUIExer6_Hizon exerciseSix = new GUIExer6_Hizon();
	}
}