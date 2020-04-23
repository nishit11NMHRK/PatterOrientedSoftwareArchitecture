package factoryplusAbstractFactory;

public class FactoryProducer 
{
	
	public static abstractFactory getFactory(String choice)
	{
		if(choice.equalsIgnoreCase("shape"))
		{
			return new ShapeFactory();
		}
		if(choice.equalsIgnoreCase("color"))
		{
			return new ColorFactory();
		}
		return null;
	}
}
