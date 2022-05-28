public class Recursion {

	public static void main(String[] args) {
		// Java recursion
		System.out.println("Java recursion\n=====");

		// output
		int result = sum(10);
		System.out.println(result);

		int total = dualSum(1, 10);
		System.out.println(total);

	}

	// sum method
	public static int sum(int num) {
		if (num > 0) {
			return num + sum(num - 1);
		} else {
			return 0;
		}
	}

	// duel sum
	public static int dualSum(int start, int end) {
		if (end >= start) {
			return end + dualSum(start, end - 1);
		} else {
			return 0;
		}
	}

}
