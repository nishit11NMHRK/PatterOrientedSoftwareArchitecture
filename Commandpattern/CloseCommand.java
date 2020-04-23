package Commandpattern;

public class CloseCommand implements Command
{
	WordDocument CloseC_wordDocument;
	Remove r2;
	
	
	
	public CloseCommand(WordDocument wd) 
	{
		CloseC_wordDocument = wd;
	}
	public CloseCommand(Remove r1) 
	{
		r2 = r1;
	}
	@Override
	public void Execute() 
	{
		
		CloseC_wordDocument.closeApp();
	}
	public void undo() 
	{
		
		CloseC_wordDocument.undoClose();
	}
	public void remove_App()
	{
		r2.remove_App();
	}

	
}
