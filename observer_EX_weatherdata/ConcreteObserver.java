package observer_EX_weatherdata;

public class ConcreteObserver implements observer
{
	private WeatherData wd;
	int temperature;
	
	public ConcreteObserver(WeatherData state)
	{
		wd = state;
		wd.register(this);
		
	}
	@Override
	public void update(int temp) 
	{
		temperature = temp;
		Display();
	}
	
	public void Display()
	{
		System.out.println("Temperature Changed to : " + wd.getState());
	}

}
