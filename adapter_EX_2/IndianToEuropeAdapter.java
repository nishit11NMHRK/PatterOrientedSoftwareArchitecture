package adapter_EX_2;

public class IndianToEuropeAdapter implements Twopin
{	
	private ThreePin threeepin;
	
	public IndianToEuropeAdapter(ThreePin tp)
	{
		threeepin = tp;
		
	}

	@Override
	public void twopin() 
	{
		System.out.println("Connecting 3 pin to 2 pin to use in Europe for");
		threeepin.threepin();
	}

}
