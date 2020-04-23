package chainOfResponsibility;

public class Handler3 implements Handler 
{
	private Handler successor3;
	
	public void setNextHandler(Handler nextHandler)
	{
		successor3 = nextHandler;
	}
	
	public void handleRequest(Request request3) 
	{
		if(request3.getValue() >0)
		{
			System.out.println("Positive Values are handled by Handler3 \t" );
			System.out.println("The value is \t" + request3.getValue());
		}
		else
		{
			successor3.handleRequest(request3);
		}
	}
	
	
	

	
}
