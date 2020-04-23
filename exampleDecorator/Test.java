package exampleDecorator;

public class Test 
{
	public static void main(String args[])
	{
		HotDrinks drinks = new DarkRoast();
				 drinks = new Milk(drinks);
				 drinks = new Milk(drinks);
				 drinks = new Hazelnut(drinks);					 
				 drinks = new Hazelnut(drinks);
				 drinks.setDrink();
			  
				
	}
}
