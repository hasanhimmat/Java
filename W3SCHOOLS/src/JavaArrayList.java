import java.util.ArrayList;

public class JavaArrayList {

	public static void main(String[] args) {
		// Java array list
		System.out.println("Java ArrayList\n=====");

		ArrayList<String> cars = new ArrayList<String>();

		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");

		// cars.clear();
		cars.remove(0);
		cars.remove(1);

		// output
		// System.out.println(cars);
		// System.out.println(cars.size());

		// line break
		// car array output
		for (String i : cars) {
			System.out.println(i);
		}

	}

}
