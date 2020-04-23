package chainOfResponsibility;

public class Handler2 implements Handler {
	
	private Handler successor2;
	
	public void setNextHandler(Handler nextHandler) 
	{
		successor2 = nextHandler;
	}

	public void handleRequest(Request request2) 
	{
		if(request2.getValue() < 0)
		{
		System.out.println("Negative Values are handled by Handler2 \t" );
		System.out.println("The value is \t" + request2.getValue());
		}
		else
		{
			successor2.handleRequest(request2);
		}
		
	}
	
	
}
