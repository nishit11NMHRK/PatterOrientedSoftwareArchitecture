package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject1 implements Subject
{
	private List<Observer> observers = new ArrayList<Observer>();
	private int state;
	
	public int getState()
	{
		return state;		
	}

	
	public void setState(int current_state) 
	{
		state = current_state;
		Notify();
		
	}

	@Override
	public void attach(Observer current_obs) 
	{
		observers.add(current_obs);
		
	}

	@Override
	public void detach(Observer current_observer) 
	{
		int i = observers.indexOf(current_observer);
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
