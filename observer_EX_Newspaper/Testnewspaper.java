package observer_EX_Newspaper;

public class Testnewspaper {

	public static void main(String[] args) 
	{
//		TimesofIndia np = new TimesofIndia();
//		
//		new Person(np);
//		np.setPaper("BollywoodTimes");
//		
//		Person2 p2 = new Person2(np);
//		p2.attach(p2);
//		np.setPaper("MumbaiMirror");
//		p2.update();
//				
//		MumbaiMirror np1 = new MumbaiMirror();
//		new Person(np1);
//		Person2 p = new Person2(np1);
//		p.attach(p);
//		p.update();
		
		TimesofIndia ti = new TimesofIndia();
		MumbaiMirror mm = new MumbaiMirror();
		
		new Person(ti);
		new Person(mm);
		
		
		Person2 p2 = new Person2(ti);
//		Person2 pp2 = new Person2(mm);
		p2.attach(p2);
//		pp2.attach(pp2);
		p2.update();
		
		
		
		ti.setPaper("TimesofIndia");
		mm.setPaper("MumbaiMirror");
	}
		
		
		
		
		
	

	}

