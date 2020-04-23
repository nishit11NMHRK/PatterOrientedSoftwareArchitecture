package Commandpattern;

public class OpenCommand implements Command
{
	private WordDocument Local_wordDocument;
	Remove r;
	
	public OpenCommand(WordDocument Local_wd) 
	{
		Local_wordDocument = Local_wd;
	}
	
	public OpenCommand(Remove r1) 
	{
		r = r1;
	}

	@Override
	public void Execute() 
	{
		Local_wordDocument.openApp();
		//Local_wordDocument.saveApp();
		
	}
	public void undo() 
	{
		Local_wordDocument.undoOpen();
		
	}
	
	public void remove_App()
	{
		r.remove_App();
	}
}
