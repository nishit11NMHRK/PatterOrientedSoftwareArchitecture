package chainOfResponsibility;

public class TestChain {

	public static void main(String[] args) 
	{
		// Setup Chain of Responsibility
				Handler h1 = new Handler1();
				Handler h2 = new Handler2();
				Handler h3 = new Handler3();
				h1.setNextHandler(h3);
				h3.setNextHandler(h2);
				h2.setNextHandler(null);

				h1.handleRequest(new Request("Value ", 4));
				h1.handleRequest(new Request("Value ", -5));
				h1.handleRequest(new Request("Value ", 45));

	}

}
