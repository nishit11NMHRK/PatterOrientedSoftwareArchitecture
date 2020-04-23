package singletonpattern;

public class Singleton2 
{
	private volatile static Singleton2 uniqueObject;
	
	private Singleton2() {}
	
	public static Singleton2 Getinstance()
	{
		if(uniqueObject == null)
		{
			synchronized (Singleton2.class) {
			if(uniqueObject == null)
			{
				uniqueObject = new Singleton2();
			}
		}
	}
		return uniqueObject;
}
}
