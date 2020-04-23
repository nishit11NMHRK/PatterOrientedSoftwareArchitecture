package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject2 
{
	private List<Observer> observers = new ArrayList<Observer>();
	private int state;
	
	public void setState(int st)
	{
		state = st;
		Notify();
	}

	public int getState()
	{
		return state;
	}
	
	public void attach(Observer ob)
	{
		observers.add(ob);
	}
	

	public void detach(Observer obs)
	{
		int i = observers.indexOf(obs);
		observers.remove(i);
	}
	public void Notify()
	{
		for(Observer o : observers)
		{
			o.update();
		}
	}
}

