package factoryplusAbstractFactory;

public class ColorFactory extends abstractFactory
{
	public Color getColor(String choice)
	{
		if(choice.equalsIgnoreCase("red"))
		{
			return new Red();
		}
		if(choice.equalsIgnoreCase("green"))
		{
			return new Green();
		}
		if(choice.equalsIgnoreCase("blue"))
		{
			return new Blue();
		}
		return null;
		
	}

	@Override
	public Shape getInstance(String choice)
	{
		return null;
	}
	
}
