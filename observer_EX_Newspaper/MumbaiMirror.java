package observer_EX_Newspaper;

import java.util.ArrayList;
import java.util.List;

public class MumbaiMirror implements NewsPaper
{
	private List<Observer> observers = new ArrayList<Observer>();
	String available;
	@Override
	public String getPaper() 
	{
		
		return available;
	}

	@Override
	public void setPaper(String state) 
	{
		available = state;
		Notify();
		
	}

	@Override
	public void attach(Observer obs) 
	{
		observers.add(obs);
		
	}

	@Override
	public void detach(Observer obs) 
	{
		int i = observers.indexOf(obs);
		observers.remove(i);
		
	}

	@Override
	public void Notify() 
	{
		for(Observer o : observers)
		{
			o.update();
		}
		
	}

}
