package Commandpattern;

public class InvokerMenuOption 
{
	Command CommandReferences;
	
	public void open(Command op1) 
	{
		CommandReferences = op1;
		CommandReferences.Execute();	
//		CommandReferences.undo();
	}

	public void save(Command sc) 
	{
		CommandReferences = sc;
		CommandReferences.Execute();
					
	}

	public void close(Command cc) 
	{
		CommandReferences = cc;
		CommandReferences.Execute();
		
	}

	public void undoo(Command c)
	{
		CommandReferences = c;
		CommandReferences.undo();

	}
	
	public void remove(Command r)
	{
		CommandReferences = r;
		CommandReferences.remove_App();
	}
	
	
	
}
