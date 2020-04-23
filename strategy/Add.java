package strategy;

public class Add implements Strategies
{	int c;
	public Add(int a, int b)
	{
		 c = a+b;
		 //calculate();
	}
	public void calculate() 
	{
		
		System.out.println("Addition is :" + c);
		
	}

}
