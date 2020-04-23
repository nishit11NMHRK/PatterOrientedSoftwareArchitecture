package Decorator;

public class RedshapeDecorator extends ShapeDecorator
{
//	/*Why super keyword is because by default when you use extends it calls the default constructor of the parent class
//	 * here in parent class we have a parameterized constructor so just use super keyword*/
		public RedshapeDecorator(Shape decoratedShape) 
		{
			super(decoratedShape);
			
		}
	
		public void draw() 
		{
			s1.draw();
			
		}
	
		
		public void print()
		{
			
			System.out.println("Adding red color to the Shape");
			
		}

}
