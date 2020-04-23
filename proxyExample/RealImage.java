package proxyExample;

public class RealImage implements Image
{
	private String fileName;
	
	public RealImage(String fn)
	{
		fileName = fn;
		LoadFromDisk(fileName);
		
	}
	@Override
	public void display() 
	{
		System.out.println("Displaying " + fileName);// TODO Auto-generated method stub
	}

	public void LoadFromDisk(String fileName)
	{
		System.out.println("Loading " +fileName);
	}
	
}
