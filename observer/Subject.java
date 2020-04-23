package observer;

public interface Subject 
{
	public int getState();
	public void setState(int state);
	public void attach(Observer obs);
	public void detach(Observer obsr);
	public void Notify();
}
