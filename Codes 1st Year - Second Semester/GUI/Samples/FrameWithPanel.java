import java.awt.*;

public class FrameWithPanel
{
	private Frame f;
	private Panel p;

	public FrameWithPanel(String title)
	{
		p = new Panel();
		p.setSize(100,100);
		p.setBackground(new Color(255, 0, 255));
	
		f = new Frame(title);
		f.setLayout(null);
		f.setSize(200,200);
		f.setBackground(Color.ORANGE);
		f.setVisible(true);
		f.add(p); 
	}

	public static void main(String args[])
	{
		FrameWithPanel fp = new FrameWithPanel("Frames and Panels");
	}
}