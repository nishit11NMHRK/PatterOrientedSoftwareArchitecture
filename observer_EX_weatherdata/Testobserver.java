package observer_EX_weatherdata;

public class Testobserver 
{

		public static void main(String args[])
		{
			WeatherData subject1 = new WeatherData();
		
			
			ConcreteObserver Observer1 = new ConcreteObserver(subject1);
			ConcreteObserver ob2 =new ConcreteObserver(subject1);		
			
			subject1.remove(Observer1);
			subject1.setTemp(20);
			subject1.remove(ob2);
			subject1.setTemp(80);
			
			
			
			
		}
}
