package Decorator;

public class Triangle implements Shape
{

	@Override
	public void draw() 
	{
		System.out.println("Triangle draw() is called");
		
	}

	@Override
	public void print() 
	{
		System.out.println("Triangle print() is called");
		
	}

}
