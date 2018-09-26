/**
 * 
 * @author Tanya Kalianda
 * Tally Counter
 */
public class TallyCounter
{
	// fields 
	//this is a declaration statement to declare the instance variable count
	private int count; 
	
	
	
	//constructors - must create b/c we have info that needs to be initialized
		//2 ways to create tally counter
	//don't need to require an argument (assume it starts at 0)
	//must initialize the constructor (ie using 0 for this project)
	//constructor below = no arguments
	public TallyCounter()
	{
		count = 0;
	}
	//create constructor that allows you to start at any arbitrary value
	//constructor below allows you to start with value on tally counter on the beginning
		//based on parameters, computer knows which constructor to call
		//ie no parameters -> goes to the no arguments constructor
	public TallyCounter(int a)
	{
		count = a;
	}
	
	
	
	//Methods
	//void b/c doesn't require any info in return
	//methods are all the things that the class can do
	//count = count + 1: basic, fundamental way to add (takes 0 in place of count -> adds 1 -> stores 1 in count -> count is now equal to 1)
			//count now stores one -> to add another, take 1 in place of count and add 1 -> count now stores 2
			//count = count + 2 -> count by twos
	public void click()
	{
		count++; //count = count + 1; 
			//another option is count += 1
			//can't use count++ to count by anything higher than ones
				//can use count += -4, count *=2, etc. (can double count, can add -4 to count using this option)
				//can use count -=3, count /=5, etc.)
	}
	public int getCount()
	{
		return count;
	}
	public void reset()
	{
		count = 0; 
	}
	public void unclick()
	{
		count--;
			//count = count-1
			//count -=1
			//only count++ or count-- work
	}
	public String toString()
	{
		return "count: " + count;
		//have access to count b/c still in class, even though its private
	}
}
