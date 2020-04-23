package strategy;

public class TestStrategy {

	public static void main(String[] args) 
	{// this example is not correct because delegation and encapsulation 
		//is not there so the client knows about the implementation of the strategy
//		Strategies s1 = new Add(4,5);
//				   s1 = new Subtract(4,5);
//				   s1 = new Multiply(4,5);
//				   s1 = new Add(6,5);
		
		
		ContextStrategy cs = new ContextStrategy();
		cs.getStrategy(new Add(0,1)); //Delegation Assigned by new Add()
		
		cs.getStrategy(new Subtract(3,1));
		
		cs.getStrategy(new Multiply(3,1));
		
	}

}
