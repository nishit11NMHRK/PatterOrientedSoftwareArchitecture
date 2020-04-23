package Decorator;

public class YelloshapeDecorator extends ShapeDecorator
{
	public YelloshapeDecorator(Shape sd)
	{
		super(sd);
	}

	@Override
	public void draw() 
	{
		s1.draw();
		
	}

	@Override
	public void print() 
	{
		System.out.println("Adding yellow color to the shape");
		
	}

}
