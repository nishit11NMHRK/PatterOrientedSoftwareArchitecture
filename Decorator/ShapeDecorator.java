package Decorator;

public abstract class ShapeDecorator implements Shape 
{
	protected Shape s1;
	public ShapeDecorator(Shape decoratedShape)
	{
		s1 = decoratedShape;
	}
//	public void draw() {}
//	public void print() {}
//	
}
