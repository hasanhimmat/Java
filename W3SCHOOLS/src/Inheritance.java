public class Inheritance{

	public static void main(String[] args) {
		// Java inheritance
		System.out.println("Java inheritance\n=====");

		// object
		Police litton = new Police();
		litton.fatt();
		litton.fattControl(4);
	}

}


// class
class Police extends Bomb{
	
	void policInfo() {
		System.out.println("BD POLIC");
	}
	
}
