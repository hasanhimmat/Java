
public class BreakContinue {

	public static void main(String[] args) {
		// Java Break and Continue
		System.out.println("Java break and continue\n=====");

		// break
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			// condition
			if (i == 6) {
				break;
			}

		}

		// separator
		System.out.println("\n=====");

		// array
		String[] company = { "bKash", "Google", "Grameenphone", "Microsoft", "Amzon", "Facebook", "IBM" };
		for (String i : company) {

			// condition
			if (i == "bKash" || i == "Grameenphone" || i == "IBM") {
				continue;
			}

			System.out.println(i);

		}

	}

}
