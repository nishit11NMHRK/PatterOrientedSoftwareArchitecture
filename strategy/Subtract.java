package strategy;

public class Subtract implements Strategies
{
	int c;
	public Subtract(int a , int b)
	{
		c = a-b;
		//calculate();
	}
	@Override
	public void calculate()
	{
		System.out.println("Subtraction is :" + c);// TODO Auto-generated method stub
		
	}

}
