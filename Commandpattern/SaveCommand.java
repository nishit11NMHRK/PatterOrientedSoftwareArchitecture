package Commandpattern;

public class SaveCommand implements Command
{
	WordDocument Local_wordDocument;
	Remove r1;
	
	
	public SaveCommand(WordDocument wd)
	{
	
		Local_wordDocument = wd;
	}
	public SaveCommand(Remove r12) 
	{
		r1 = r12;
	}
	@Override
	public void Execute() 
	{
		Local_wordDocument.saveApp();
		
	}
	public void undo() {
		
		Local_wordDocument.undoSave();
		
	}

	public void remove_App()
	{
		r1.remove_App();
	}
}
