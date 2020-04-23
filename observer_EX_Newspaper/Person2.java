package observer_EX_Newspaper;

public class Person2 implements Observer
{
	
	NewsPaper newspaper;
	
	public Person2(NewsPaper mm) 
	{
		newspaper = mm;
	}
	
	public void attach(Observer obs)
	{
		newspaper.attach(obs);
		
	}
	
	@Override
	public void update()
	{
		System.out.println("Newspaper available : " +newspaper.getPaper() );
		
	}
	

}
