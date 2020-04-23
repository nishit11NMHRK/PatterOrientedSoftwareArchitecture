package adapter_EX_2;

public class TestAdapter {

	public static void main(String[] args) 
	{
		IndianThreePin tttp = new IndianThreePin();
		Twopin ttp= new EuropeTwoPin();
		
		Twopin indiantoeuropeadapter = new IndianToEuropeAdapter(tttp);
		
		tttp.threepin();
		System.out.println("");
		
		
		ttp.twopin();
		System.out.println("");
		
		
		indiantoeuropeadapter.twopin();

	}

}
