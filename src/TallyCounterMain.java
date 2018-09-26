public class TallyCounterMain {

	public static void main(String[] args)
	{
		TallyCounter counter1 = new TallyCounter();
		TallyCounter counter2 = new TallyCounter(100);
		System.out.println(counter1.getCount());
		System.out.println(counter2.getCount());
		counter1.click();
		counter1.click();
		counter1.click();
		System.out.println(counter1.getCount());
		counter1.unclick();
		System.out.println(counter1.getCount());
		counter1.reset();
		System.out.println(counter1.getCount());
		System.out.println(counter1);
		System.out.println(counter1.toString());
	
		
		String stringDeal = counter1.toString();
		System.out.println(stringDeal);
		
		String stringDeal2 = "" + counter1; 
		System.out.println(stringDeal2);
	
	}
		
		
		//if previous was not private: counter1.count = 5; to get the count method
		//b/c it was private: counter1.getCount()



}
