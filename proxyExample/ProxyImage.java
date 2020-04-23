package proxyExample;

public class ProxyImage implements Image
{
	private RealImage realImage;
	private String fileName;
	
	public ProxyImage(String fn)
	{
		fileName=fn;
	}
	@Override
	public void display() 
	{
		if(realImage==null)// TODO Auto-generated method stub
		{
			realImage = new RealImage(fileName);
		}
		realImage.display();
	}

}
