
public class Conditions {

	public static void main(String[] args) {
		// Conditions and if statements
		System.out.println("Conditions and If Statements\n=====");
		
		// variable
		int husbandAge = 24;
		int wifeAge = 24;
		
		// condition
		if(husbandAge > wifeAge) {
			int diff = husbandAge - wifeAge;
			System.out.println("Hasband is Senior\nAge diff:"+ diff);
		}else if(husbandAge == wifeAge) {
			System.out.println("Hasband & Wife age is same");
		}else {
			int diff = wifeAge - husbandAge;
			System.out.println("Wife is Senior\nAge diff:"+ diff);
		}
	}

}
