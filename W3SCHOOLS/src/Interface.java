public class Interface implements MathBoss {

	@Override
	public void userInfo(String name, int age) {
		// output
		System.out.printf("My name is %s, age now %d", name, age);

	}

	@Override
	public void whatsIs(int number) {
		// output
		switch (number % 2) {
		case 0:
			System.out.println(number + " is even number");
			break;
		case 1:
			System.out.println(number + " is odd number");
			break;
		default:
			System.out.println("something is worng");
		}

	}

}
