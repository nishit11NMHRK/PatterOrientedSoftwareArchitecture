package observer_EX_Newspaper;

public interface NewsPaper 
{
	public String getPaper();
	public void setPaper(String state);
	public void attach(Observer obs);
	public void detach(Observer obs);
	public void Notify();
	
}
