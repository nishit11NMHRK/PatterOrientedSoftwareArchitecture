package exampleDecorator;

public abstract class Decorator implements HotDrinks
{
	protected HotDrinks hotdrink;
	public Decorator(HotDrinks hd)
	{
		hotdrink = hd;
	}
	public void setDrink() 
	{
		
	}
}
