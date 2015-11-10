
public class CaveParser 
{
	private String theJSON;
	
	public CaveParser(String json)
	{
		this.theJSON = json;
	}
	
	public void parse()
	{
		//will walk through our json string and create a JSONObject (which is a
		//collection of name/value pairs where values can be JSONObjects, JSONArrays,
		//or literals (like 5 or 7)
		String temp = "";
		for(int i = 0; i < this.theJSON.length(); i++)
		{
			temp = "" + this.theJSON.charAt(i);
			if(temp.equals("{"))
				{
						System.out.println("JSONObject begins");
				}
			else if(temp.equals("}"))
			{
					System.out.println("JSONObject ends");
			}
			else if(temp.equals("["))
			{
					System.out.println("JSONArray begins");
			}
			else if(temp.equals("]"))
			{
					System.out.println("JSONArray ends");
			}
		}
		
	}
}