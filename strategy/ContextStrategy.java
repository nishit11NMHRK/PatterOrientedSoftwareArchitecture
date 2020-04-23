package strategy;

public class ContextStrategy 
{
	private Strategies strategy;
	
	public void getStrategy(Strategies s)
	{
		strategy = s; // Delegation
		//strategy.calculate();
		strategy.calculate();
	}
	
}
