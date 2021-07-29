import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUIExer7_Hizon implements ActionListener
{
	// Containers
	private JFrame f;
	private JPanel p1, p2, p3;

	// Compartments
	private JButton b1, b2;
	private JTextField tf1, tf2;
	private JLabel l1;

	public GUIExer7_Hizon()
	{
		f = new JFrame("MegaCalc");

		GridBagConstraints c = new GridBagConstraints();
		GridBagLayout layout = new GridBagLayout();  

		p1 = new JPanel();
	
        tf1 = new JTextField("0", 10);
        c.fill = GridBagConstraints.HORIZONTAL; 
        p1.add(tf1, c);

        b1 = new JButton("+");
        c.fill = GridBagConstraints.HORIZONTAL; 
        p1.add(b1, c);

        tf2 = new JTextField("0", 10);
        c.fill = GridBagConstraints.HORIZONTAL; 
        p1.add(tf2, c);

        p2 = new JPanel();

        l1 = new JLabel("0");
        c.fill = GridBagConstraints.HORIZONTAL; 
        p2.add(l1, c);

        p3 = new JPanel();

        b2 = new JButton("Clear");
        c.fill = GridBagConstraints.HORIZONTAL; 
        p3.add(b2, c);

		f.getContentPane().add(p1, BorderLayout.NORTH);
		f.getContentPane().add(p2, BorderLayout.WEST);
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
		int num1, num2, result = 0;

		if(tf1.getText() != null)
		{
			num1 = Integer.parseInt(tf1.getText());
			num2 = Integer.parseInt(tf2.getText());

			if(source == b1)
			{
				result = num1 + num2;
			}

			else if(source == b2)
			{
				tf1.setText("0");
				tf2.setText("0");
				l1.setText("0");
			}

			else
			{

			}

			l1.setText("" + result);
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
		GUIExer7_Hizon exerciseSeven = new GUIExer7_Hizon();
	}
}