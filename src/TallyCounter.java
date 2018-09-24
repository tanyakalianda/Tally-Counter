
public class TallyCounter
{
	// fields
	private int count; 
	
	//constructors - must create b/c we have info that needs to be initialized
	//don't need to require an argument (assume it starts at 0)
	//must initialize the constructor with 0
	public TallyCounter();
	{
		count = 0;
	}
	
	public void click()
	{
		count++;
	}
	
}
