package exampleDecorator;

public class DarkRoast implements HotDrinks
{
	public float price() 
	{
		return 5;
	
	}

	@Override
	public void setDrink() 
	{
		
		price();
	}

}
