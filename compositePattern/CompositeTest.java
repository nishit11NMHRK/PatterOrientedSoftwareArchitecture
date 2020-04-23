package compositePattern;

public class CompositeTest {

	public static void main(String[] args) 
	{
		Employee emp1 = new Developer("Nishit Singh", 70000);
		Employee emp2 = new Developer("Srinivas Nalikala", 100000);
		emp1.print();
		emp2.print();
		
		Employee manager1 = new Manager("Kanika Kaur", 1500000);
		
		manager1.add(emp1);
		manager1.add(emp2);
		manager1.print();
		
		Employee emp3 = new Developer("XYZ", 50000);
		emp3.print();
		
		Manager generalManager = new Manager("Maxx" , 75000);
		
		generalManager.add(emp3);
		generalManager.add(manager1);
		generalManager.print();
		
		
	}

}
