package chainOfResponsibility;

public class Request 
{
	
	private int m_value;
	private String m_description;

	public Request(String description, int value)
	{
		m_description = description;
		m_value = value;
	}
	public String getDescription()
	{
		return m_description;
	}          
	public int getValue()
	{
		return m_value;
	}

	

}
