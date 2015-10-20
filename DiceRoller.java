
public class DiceRoller 
{
	
	public static int rollDice(String diceString)
	{
		String numDice = "";
		String numSides = "";
		int rollTotal = 0;
		boolean haveD = false;
		for(int i = 0; i <= diceString.length() - 1; i++)
		{
			if(isDigit(diceString.charAt(i)) == true) //if it's a digit...
			{
				if(haveD == false)
				{
					numDice = numDice + diceString.charAt(i);
				}
				else if(haveD == true)
				{
					numSides = numSides + diceString.charAt(i);
				}

			}
			if(isD(diceString.charAt(i)) == true) //if it's a 'D'...
			{
				haveD = true;
			}
			if((isPlus(diceString.charAt(i)) == true) || (i == diceString.length() -1)) // if it's a '+' or the end of diceString...
			{
				Dice d = new Dice(Driver.stringToInt(numSides));
				for(int j = 1; j <= Driver.stringToInt(numDice); j++)
				{
					rollTotal = rollTotal + d.roll();
				}
				haveD = false;
				numDice = "";
				numSides = "";
			}
			
		}
		return rollTotal;
	}
	
	public static boolean isDigit(char c)
	{
		String digitString = "0123456789";
		for(int i = 0; i < 10; i++)
		{
			if(c == digitString.charAt(i))
			{
				return true;
			}
		}
		return false;
	}
	
	public static boolean isD(char c)
	{
		if(c == 'D')
		{
			return true;
		}
		else return false;
	}
	
	public static boolean isPlus(char c)
	{
		if(c == '+')
		{
			return true;
		}
		else return false;
	}
	
}
