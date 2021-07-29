import java.awt.*;
import java.awt.event.*;

public class TestAdapterClass extends MouseAdapter
{	
	private Frame f;
	private TextField tf;

	public TestAdapterClass()
	{
		f = new Frame("Test Adapter Class");
		tf = new TextField(30);
	}

	public void launchFrame()
	{
		Label label = new Label("Click and drag the mouse");

		f.add(label, BorderLayout.NORTH);
		f.add(tf, BorderLayout.SOUTH);

		f.addMouseMotionListener(this);
		f.addMouseListener(this);

		f.setSize(100,200);
		f.setVisible(true);
	}

	public void mouseDragged(MouseEvent e)
	{
		String s = "Mouse dragging: X = " + e.getX() + " Y = " + e.getY(); 
		tf.setText(s);
	}

	public void mouseEntered(MouseEvent e)
	{
		String s = "The mouse entered";
		tf.setText(s);
	}

	// Unused MouseMotionListener
	public void mouseExited(MouseEvent e)
	{
		String s = "The mouse has left the building";
		tf.setText(s);
	}

	public static void main(String args[])
	{
		TestAdapterClass test = new TestAdapterClass();
		test.launchFrame();
	}
}