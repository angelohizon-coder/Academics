import java.awt.*;

public class TestButton
{
	private Frame f;
	private Button b;

	public TestButton()
	{
		f = new Frame("Test Button");
		b = new Button("Click Me!");
	}

	public void launchFrame()
	{
		b.addActionListener(new ButtonHandler());
		b.addActionListener(new MyOtherEventHandler());

		f.add(b);
		f.pack();
		f.setVisible(true);
	}

	public static void main(String args[])
	{
		TestButton tb = new TestButton();
		tb.launchFrame();
	}
}