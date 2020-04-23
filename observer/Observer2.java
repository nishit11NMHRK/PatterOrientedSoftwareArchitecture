package observer;

public class Observer2 implements Observer
{
	private Subject subject2;
	private Subject2 subj2;
	
	public Observer2(Subject current_subject, Subject2 sub2)
	{
		subject2 = current_subject;
		subj2 =sub2;
		
	}
	@Override
	public void update() 
	{
		System.out.println("State change for observer2 : " + subject2.getState());
		System.out.println("Subject2 state change Observer2: "+ subj2.getState());
		
	}
	public void attach(Observer ob)
	{
		subj2.attach(ob);
		subject2.attach(ob);
	}

}
