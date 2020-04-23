package observer_EX_Newspaper;

public class Person implements Observer
{	
	NewsPaper newspaper;
	
	public Person(NewsPaper np)
	{
		newspaper = np;
		newspaper.attach(this); 
		// why using this keyword? Its when there's a same variable you are dealing with then to use the current
		//object which comes from the new object creation in main() thats why to make the compiler understand to use the current object. 
	}
	
	@Override
	public void update() 
	{
		System.out.println("New newspaper arrived : " +newspaper.getPaper() );// TODO Auto-generated method stub
		
	}

}
