
public class JSONArray extends JSONVariable
{
	private String name;
	private JSONVariable[] value;
	public int currSize;
	
	public JSONArray(String name, JSONVariable[] value)
	{
		super(name);
		this.value = value;
		this.currSize = 0;
	}

	void display()
	{
		System.out.println("JSON Array - " + this.currSize + "elements");
		String arrayToPrint = "[";
		for(int i = 0; i < this.currSize; i++)
		{
			arrayToPrint += " " + this.value[i].toString();
		}
		arrayToPrint += "]";
		System.out.println(arrayToPrint);
		
	}
	
}
