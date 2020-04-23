package proxyExample;

public class TestProxy {

	public static void main(String[] args) 
	{
		Image image = new ProxyImage("test_10mb.jpg");
		
		image.display();
//		image.display();
		System.out.println("");
		
		
		image.display();
 	}

}
