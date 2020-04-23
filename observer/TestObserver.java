package observer;

public class TestObserver {

	public static void main(String[] args) 
	{
		Subject1 subject = new Subject1();
		Subject2 sub2 = new Subject2(); 
		Observer1 ob1 =	 new Observer1(subject, sub2);
		Observer2 ob2 =	 new Observer2(subject, sub2);
		
		
		ob1.attach(ob1);
		ob2.attach(ob2);
		
		subject.setState(3);
		sub2.setState(8);
		
					 
				
				
	}

}
