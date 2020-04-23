package singletonpattern;

public class test {

	public static void main(String[] args) 
	{
		System.out.println("Object \n" + Singleton.getInstance());
		System.out.println("Object \n" + Singleton.getInstance());
		
		/*Singleton1 obj1 = Singleton1.getObject();
		System.out.println(obj1);
		Singleton1 obj2 = Singleton1.getObject();
		System.out.println(obj2);*/
		
		/*System.out.println("Object \n" + Singleton.getInstance());
		System.out.println("Object \n" + Singleton1.getObject());
		System.out.println("Object \n" + Singleton2.Getinstance());*/
		//System.out.println("Object \n" + Singleton1.getObject() + "\n" + Singleton2.Getinstance()+ "\n" + Singleton.getInstance() );
		
	}

}
