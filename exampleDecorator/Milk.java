package exampleDecorator;

public class Milk extends Decorator
{

	public Milk(HotDrinks df)
	{
		super(df);
		
	}

	@Override
	public float price() 
	{
		
		return 5 + hotdrink.price();
		
		
	}

	@Override
	public void setDrink()
	{
		System.out.println("Milk is added to DarkRoast coffee\t");
		System.out.println("Total:" +price());
		
	}

	
	

}
