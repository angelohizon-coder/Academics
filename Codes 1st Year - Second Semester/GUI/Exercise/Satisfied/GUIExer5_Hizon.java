import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUIExer5_Hizon
{
	// Containers
	private JFrame f;
	private JPanel p1, p2, p3, p4;

	// Compartments
	private JButton b1;
	private JLabel l1, l2, l3;
	private JTextField tf1, tf2, tf3;

	public GUIExer5_Hizon()
	{
		f = new JFrame("Compose Message");

		GridBagConstraints c = new GridBagConstraints();
		GridBagLayout layout = new GridBagLayout();  

		p1 = new JPanel();
		
		l1  = new JLabel("To: ");
		c.fill = GridBagConstraints.HORIZONTAL;  
        c.gridx = 0;  
        c.gridy = 0;  
        p1.add(l1, c);
		tf1 = new JTextField("", 22);
		c.fill = GridBagConstraints.HORIZONTAL;  
        c.gridx = 1;  
        c.gridy = 0;  
        p1.add(tf1, c);

        l2  = new JLabel("CC: ");
		c.fill = GridBagConstraints.HORIZONTAL;  
        c.gridx = 0;  
        c.gridy = 0;  
        p1.add(l2, c);
		tf2 = new JTextField("", 22);
		c.fill = GridBagConstraints.HORIZONTAL;  
        c.gridx = 1;  
        c.gridy = 1;  
       	p1.add(tf2, c);

		tf3 = new JTextField("", 24);
		tf3.setPreferredSize(new Dimension(0, 60));
		c.fill = GridBagConstraints.HORIZONTAL;  
        c.gridx = 0;  
        c.gridy = 2;  
        p1.add(tf3, c);

        l2  = new JLabel("                                                                 ");
        c.fill = GridBagConstraints.HORIZONTAL;  
        c.gridx = 0;  
        c.gridy = 3;  
        p1.add(l2, c);

        b1 = new JButton("Send");
        c.fill = GridBagConstraints.HORIZONTAL;  
        c.gridx = 1;  
        c.gridy = 3;  
        p1.add(b1, c);

		f.add(p1);

		f.setSize(300, 200);
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
		GUIExer5_Hizon exerciseFive = new GUIExer5_Hizon();
	}
}