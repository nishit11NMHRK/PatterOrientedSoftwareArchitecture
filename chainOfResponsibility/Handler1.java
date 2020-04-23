package chainOfResponsibility;


public class Handler1 implements Handler
{
	 private Handler successor1;
	
	public void setNextHandler(Handler nextHandler) 	
	{
		successor1 = nextHandler;
		
	}
	public void handleRequest(Request request1)
	{
		if(request1.getValue() == 0)
		{
		System.out.println("Zero Values are handled by Handler1 \t" );
		System.out.println("The value is \t" + request1.getValue());
		}
		else
		{
			successor1.handleRequest(request1);
		}
	}
	


}
