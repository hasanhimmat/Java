
public class MultidimensionalArrays {

	public static void main(String[] args) {
		// Multidimensional arrays
		System.out.println("Multidimensional arrays\n=====");

		String[][] myNumbers = { { "Hasan", "Hasib", "Hossain", "Hasna" }, { "Sujon", "Jony", "Abid", "Belal" },
				{ "Mishrat", "Zahid", "Nazmul", "Imran" }, { "Arman", "Arafat", "Mofazzel", "Atikul" } };
		// array find
		String family = myNumbers[0][2];
		String outside = myNumbers[3][3];

		System.out.println(family);
		System.out.println(outside);

		// separator
		System.out.println("=====");

		// array output
		for (String i : myNumbers[1]) {
			System.out.println(i);
		}
	}

}
