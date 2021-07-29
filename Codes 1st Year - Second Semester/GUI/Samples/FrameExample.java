import java.awt.*;

public class FrameExample
{
	private Frame f;

	public FrameExample()
	{
		f = new Frame("Hello Frame");
		f.setBackground(Color.YELLOW);
		f.setSize(200, 200);
		f.setVisible(true);
	}

	public static void main(String args[])
	{
		FrameExample fe = new FrameExample();
	}
}