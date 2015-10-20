import java.util.Random;

public class Dice
{
	//fields
	private int numSides;
	private String name;
	private Random r = new Random();
	
	//constructors
	public Dice(int numSides)
	{
		this.numSides = numSides;
		this.name = "D" + numSides;
	}
	
	//methods
	public int roll()
	{
		return r.nextInt(this.numSides) + 1;
	}
}
