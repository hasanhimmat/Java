import java.time.LocalDate;

public class JavaDate {

	public static void main(String[] args) {
		// Java Date
		System.out.println("Java Date\n=====");
		
		LocalDate today = LocalDate.now();
		
		System.out.println(today);
		
		// single day, month, year output
		System.out.println(today.getDayOfMonth());
		System.out.println(today.getMonthValue());
		System.out.println(today.getYear());

	}

}
