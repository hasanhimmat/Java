import java.util.LinkedList;

public class JavaLinkedList {
	public static void main(String[] args) {
		// Java linked list
		System.out.println("Java linkedList\n=====");

		LinkedList<String> friends = new LinkedList<String>();

		// add
		friends.add("Sujon");
		friends.add("Jony");
		friends.add("Asadul");
		friends.add("Belal");
		friends.add("Abid");
		friends.add("Nazmul");
		friends.add("Zahid");

		// clear
		//friends.clear();

		// get
		System.out.println("Past rich friends: " + friends.get(4));

		// remove
		friends.remove(6);
		friends.remove(5);
		friends.remove(4);
		friends.remove(3);
		friends.remove(2);

		// size
		System.out.println("Linked list size: " + friends.size() + "\n");

		// output
		System.out.println(friends);

	}

}
