package exampleDecorator;

public class Hazelnut extends Decorator
{

	public Hazelnut(HotDrinks hd)
	{
		super(hd);
		
	}

	@Override
	public float price() 
	{
		
		return 5 + hotdrink.price();
	}

	@Override
	public void setDrink() 
	{
		System.out.println("Hazelnut is added to the coffee");
		System.out.println("Total:"+ price());
		
	}

	
	

}
