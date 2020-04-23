package chainOfResponsibility;

public interface Handler 
{
	public void setNextHandler(Handler nextHandler);
	
	public abstract void handleRequest(Request request);
}
