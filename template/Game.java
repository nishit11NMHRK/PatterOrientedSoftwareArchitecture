package template;

public abstract class Game 
{

	
	 abstract void startGame();
	 abstract void endGame();
	 abstract void initialise();
	
	final void play()
	{
		initialise();
		startGame();
		endGame();
			
	}
	
}
