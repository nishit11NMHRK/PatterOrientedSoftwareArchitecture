package factoryplusAbstractFactory;

public class ShapeFactory extends abstractFactory
{
	public Shape getInstance(String choice)
	{
		if(choice.equalsIgnoreCase("circle"))
		{
			return new CircleShape();
		}
		if(choice.equalsIgnoreCase("triangle"))
		{
			return new TriangleShape();
		}
		if(choice.equalsIgnoreCase("square"))
		{
			return new SquareShape();
		}
		return null;
	}

	@Override
	public Color getColor(String choice) 
	{
		return null;
	}

}
