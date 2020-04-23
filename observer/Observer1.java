package observer;

public class Observer1 implements Observer
{
	private Subject subject;
	private Subject2 sub;
	
	public Observer1(Subject current_subject, Subject2 curt_sub)
	{
		subject = current_subject;
		sub = curt_sub;
		
	}

	@Override
	public void update() 
	{
		System.out.println("State change for observer1 : " + subject.getState());
		System.out.println("Subject2 state change for Observer1 : "+ sub.getState());
		
	}
	public void attach(Observer ob)
	{
		subject.attach(ob);
		sub.attach(ob);
	}
	
}
