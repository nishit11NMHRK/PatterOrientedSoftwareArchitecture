package strategy;

public class Multiply implements Strategies
{
	int c;
	public Multiply(int a, int b)
	{
		c = a*b;
		//calculate();
	}

	@Override
	public void calculate() 
	{
		System.out.println("Multiplication is :"+c);
		
	}

}
