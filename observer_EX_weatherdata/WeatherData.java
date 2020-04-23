package observer_EX_weatherdata;

import java.util.ArrayList;
import java.util.List;

public class WeatherData
{
	int temp;
	private List<observer> ObserversArray = new ArrayList<observer>();
	
	public int getState()
	{
		return temp;
	}
	
	public void register(observer o)
	{
		ObserversArray.add(o);
	}
	
	public void remove(observer o)
	{
		ObserversArray.remove(o);
	}
	
	public void setTemp(int temperature)
	{
		temp = temperature;
		Notify();
	}
	
	public void Notify()
	{
		for(observer obs:ObserversArray)
		{
			obs.update(temp);
		}
	}
}
