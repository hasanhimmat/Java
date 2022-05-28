public class TypeCasting {
	public static void main(String[] args) {
		// type casting
		System.out.println("Type casting");
		
		// Widening Casting
		System.out.println("\nWidening Casting");
		byte one = 127;
		float two = one;
		System.out.println(two);
		
		// Narrowing Casting
		System.out.println("\nNarrowing Casting");
		double ssc_hsc = 8.72;
		int total_gpa = (int) ssc_hsc;
		System.out.println(total_gpa);
	}
	
}
