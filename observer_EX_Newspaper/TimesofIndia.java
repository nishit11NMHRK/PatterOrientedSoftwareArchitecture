package observer_EX_Newspaper;

import java.util.ArrayList;
import java.util.List;

public class TimesofIndia implements NewsPaper
{
	private List<Observer> observers = new ArrayList<Observer>();
	String paper;
	@Override
	public String getPaper() 
	{
		// TODO Auto-generated method stub
		return paper;
	}

	@Override
	public void setPaper(String state) 
	{
		paper = state;
		Notify();// TODO Auto-generated method stub
		
	}

	@Override
	public void attach(Observer obs) 
	{
		observers.add(obs);// TODO Auto-generated method stub
		
	}

	@Override
	public void detach(Observer obs) 
	{
		int i = observers.indexOf(obs);
		observers.remove(i);// TODO Auto-generated method stub
		
	}

	@Override
	public void Notify() 
	{
		
		for(Observer o: observers)
		{
			
			o.update();
			
		}// TODO Auto-generated method stub
		
	}

}
