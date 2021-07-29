public class Recording
{
	private String title;
	private String artist;
	private int playingTime;
	
	public void setSong(String t)
	{
		title = t;
	}
	
	public void setArtist(String a)
	{
		artist = a;
	}
	
	public void setPlayTime(int pt)
	{
		playingTime = pt;
	}
	
	public String getSong()
	{
		return title;
	}
	
	public String getArtist()
	{
		return artist;
	}
	
	public int getPlayTime()
	{
		return playingTime;
	}
}