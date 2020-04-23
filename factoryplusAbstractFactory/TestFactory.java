package factoryplusAbstractFactory;

public class TestFactory {

	public static void main(String[] args) 
	{
		/*Abstract fatcory method pattern*/
		/*Without using static in FactoryProducer*/
		/*FactoryProducer fp = new FactoryProducer(); //instantiates FactoryProducer class
		
		abstractFactory af = fp.getFactory("shape"); // create variable of type abstractFactory "af" and taking object of FactoryProducer "fp" call its getFactory()
		abstractFactory	af1 = fp.getFactory("color"); //create variable of type abstractFactory "af1" and taking object of FactoryProducer "fp" call its getFactory()
		
		Shape s1 = af.getInstance("circle"); // create variable of type Shape "s1" and taking variable of abstractFactory "af" call its getInstance()
		      s1.Draw();					// using the variable of type Shape "s1" call its Draw()
		Color c1 = af1.getColor("blue");// create variable of type Color "c1" and taking variable of abstractFactory "af1" call its getColor()
			  c1.fill();				// using the variable of type Color "c1" call its fill()
						
		abstractFactory af2 = fp.getFactory("shape");
		abstractFactory	af3	 = fp.getFactory("color");
	    
		Shape s2 = af2.getInstance("square");
		      s2.Draw();
		Color c2 = af3.getColor("green");
			  c2.fill();*/
		
		/*Abstract fatcory method pattern*/
		/*with USING Static keyword in FactoryProducer*/
		abstractFactory ShapeFactory = FactoryProducer.getFactory("shape");
		Shape s = ShapeFactory.getInstance("circle");
		Shape s1 = ShapeFactory.getInstance("triangle");
		s.Draw();
		s1.Draw();
		
		abstractFactory ColorFactory = FactoryProducer.getFactory("color");
		Color ss = ColorFactory.getColor("red");
		Color ss1 = ColorFactory.getColor("blue");
		ss.fill();
		ss1.fill();
		
//		/*Fatcory Method pattern only this much client code*/
//		ShapeFactory sf = new ShapeFactory();
//		
//		Shape shape1 =	sf.getInstance("circle");
//		shape1.Draw();
//	
//		Shape shape2 = sf.getInstance("Triangle");
//		shape2.Draw();
//		
//		Shape shape3 = sf.getInstance("SQUARE");
//		shape3.Draw();

	}

}
