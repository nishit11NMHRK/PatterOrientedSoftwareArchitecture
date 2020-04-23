package compositePattern;

public class Developer implements Employee
{
	private String name;
	private double salary;
	
	public Developer(String Developername, double DeveloperSalary)
	{
		name = Developername;
		salary = DeveloperSalary;
		
	}
	
	public void add(Employee employee) {}

	@Override
	public void remove(Employee employee) {}

	@Override
	public Employee getChild(int i) 
	{return null;}

	@Override
	public String getName() 
	{
		
		return name;
	}

	@Override
	public double getSalary() {
				return salary;
	}

	@Override
	public void print() {
		System.out.println("$$$$$$$$$$$$$$$$$$$$");
		System.out.println("Name =  " +getName());
		System.out.println("Salary = "+ getSalary());
		System.out.println("$$$$$$$$$$$$$$$$$$$$");
	}

}
