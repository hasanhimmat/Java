import java.util.ArrayList;
import java.util.Iterator;

public class Iterator{
	public static void main(String[] args) {
		// Java Iterator
		System.out.println("Java Iterator\n=====");
		
		// Array list
	    ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    
	    Iterator<String> it = cars.iterator();
		
	}
	
}