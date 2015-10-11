
public class GameEntry 
{
	private String name;
	private int score;
	
	GameEntry(String name,int score)
	{
		this.name = name;
		this.score = score;
	}

	public String getName()
	{
		return name;
	}
	public int getScore()
	{
		return score;
	}

	public String toString()
	{
		return "Name:"+getName()+"Score:"+getScore();
	}

}
