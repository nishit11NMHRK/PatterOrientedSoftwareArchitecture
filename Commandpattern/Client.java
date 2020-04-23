package Commandpattern;

public class Client 
{
	
	public static void main(String[] args)
	{
		//receiver
		WordDocument wd = new WordDocument();
		Remove r1 = new Remove();
		
		
		
		//concretecommands
		OpenCommand op = new OpenCommand(wd);
		SaveCommand sc = new SaveCommand(wd);
		CloseCommand cc = new CloseCommand(wd);		
		
//		OpenCommand op1 = new OpenCommand(r1);
//		SaveCommand sc1 = new SaveCommand(r1);
//		CloseCommand cc1 = new CloseCommand(r1);		
		
		
		
		//Invoker
		InvokerMenuOption in = new InvokerMenuOption();
		in.open(op);
		in.save(sc);
		in.close(cc);
		in.undoo(op);
		in.undoo(sc);
		in.undoo(cc);
		
//		in.remove(op1);
//		in.remove(sc1);
//		in.remove(cc1);
		
	}

}
