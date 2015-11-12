public class JSONObject 
{
	public JSONVariable[] theVariables;
	private int currSize;
	
	public JSONObject()
	{
		this.theVariables = new JSONVariable[50];
		this.currSize = 0;
	}
	
	public void addVariable(JSONVariable jv)
	{
		if(this.currSize < this.theVariables.length)
		{
			this.theVariables[this.currSize] = jv;
			this.currSize++;
		}
		else
		{
			JSONVariable[] temp = new JSONVariable[this.theVariables.length + 1];
			for(int i = 0; i < temp.length; i++)
			{
				temp[i] = this.theVariables[i];
			}
			temp[this.currSize] = jv;
			this.theVariables = temp;
			this.currSize++;
		}
	}
}