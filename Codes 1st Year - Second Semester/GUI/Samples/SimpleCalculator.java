import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleCalculator implements ActionListener
{
	// container
	private JFrame f;
	private JPanel p1, p2, p3, p4;

	// components
	private JLabel l1, l2, l3;
	private JTextField tf1, tf2, tf3;
	private JButton bAdd, bSub, bMul, bDiv, bClear;

	public SimpleCalculator()
	{
		// container
		f = new JFrame("My First GUI App");

		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();

		// components
		l1 = new JLabel("First: ");
		l2 = new JLabel("Second: ");
		l3 = new JLabel("Third: ");

		tf1 = new JTextField("0.0", 15);
		tf2 = new JTextField("0.0", 15);
		tf3 = new JTextField("0.0", 15);

		bAdd = new JButton("+");
		bSub = new JButton("-");
		bMul = new JButton("*");
		bDiv = new JButton("/");
		bClear = new JButton("C");
	}

	public void launchFrame()
	{
		// place all componenets to their respective panels
		// use the default layout manager of the Panel, FlowLayout

		p1.add(l1);
		p1.add(tf1);

		p2.add(l2);
		p2.add(tf2);

		p3.add(l3);
		p3.add(tf3);

		p4.add(bAdd);
		p4.add(bSub);
		p4.add(bMul);
		p4.add(bDiv);
		p4.add(bClear);

		// change the layout manager to GridLayout(4,1)
		f.setLayout(new GridLayout(4,1));

		f.add(p1);
		f.add(p2);
		f.add(p3);
		f.add(p4);

		f.pack();
		f.setVisible(true);

		bAdd.addActionListener(this);
		bSub.addActionListener(this);
		bMul.addActionListener(this);
		bDiv.addActionListener(this);
		bClear.addActionListener(this);

		f.addWindowListener(new MyCloseButtonHandler());
	}

	public void actionPerformed(ActionEvent ae)
	{
		Object source = ae.getSource();
		double num1, num2, result = 0.0;

		if(tf1.getText() != null && tf2.getText() != null)
		{
			num1 = Double.parseDouble(tf1.getText());
			num2 = Double.parseDouble(tf2.getText());

			if(source == bAdd)
			{
				result = num1 + num2;
			}

			else if(source == bSub)
			{
				result = num1 - num2;
			}

			else if(source == bMul)
			{
				result = num1 * num2;
			}

			else if(source == bDiv)
			{
				result = num1 / num2;
			}

			else if(source == bClear)
			{
				tf1.setText("0.0");
				tf2.setText("0.0");
				tf3.setText("0.0");
			}

			else
			{

			}

			tf3.setText("" + result);
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
		SimpleCalculator sc = new SimpleCalculator();
		sc.launchFrame();
	}
}
