package Decorator;

public class TestDecorator {

	public static void main(String[] args) 
	{
		/*Can use both abstract classes or interface*/
//		Shape redCircle = new RedshapeDecorator(new Circle());
//		redCircle.draw();
//		System.out.println("Red color is going to fill the circle");
//		redCircle.print();
//		
//		Shape redTriangle = new RedshapeDecorator(new Triangle());
//		redTriangle.draw();
//		System.out.println("Red color is going to fill the Triangle");
//		redTriangle.print();
		
		
//		Shape s = new Circle();
//		Shape  s1 = new Triangle();
//		
//		ShapeDecorator sd = new RedshapeDecorator(s);
//					   sd.draw();
//					   sd.print();
//					   sd = new RedshapeDecorator(s1);
//					   sd.draw();
//					   sd.print();
//	
		
		
		Shape s = new Circle();
				s = new RedshapeDecorator(s);
				s = new YelloshapeDecorator(s);
				s.draw();
				s.print();
				
		Shape s1 = new Triangle();
		s1 = new RedshapeDecorator(s1);
		s1 = new YelloshapeDecorator(s1);
		s1.draw();
		s1.print();
		
	}

}
