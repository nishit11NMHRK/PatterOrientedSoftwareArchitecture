package strategy;

public class client2 {

	public static void main(String[] args) 
	{
		ContextStrategy cs2 = new ContextStrategy();
		cs2.getStrategy(new Subtract(3,8));// TODO Auto-generated method stub
		cs2.getStrategy(new Add(1,1));
	}

}
