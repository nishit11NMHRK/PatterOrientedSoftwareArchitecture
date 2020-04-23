package Decorator;

public class Circle implements Shape
{

	@Override
	public void draw() 
	{
		System.out.println("Circle draw() is called");
		
	}

	@Override
	public void print() 
	{
		System.out.println("Circle print() is called");
		

	}

}
