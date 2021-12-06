import java.util.Scanner;

class Singly {

	static class Node {
		private int data;
		private Node next;

		public Node() {

			data = 0;
			next = null;
		}

		public Node(int val) {
			data = val;
			next = null;
		}
	}

	private Node head;

	public Singly() {
		head = null;
	}

	public void addFirst(int val) {

		Node newNode = new Node(val);
		newNode.next = head;
		head = newNode;
	}

	public void addLast(int val) {

		Node newNode = new Node(val);
		if (head == null) {
			head = newNode;
		} else {
			Node trav = head;
			while (trav.next != null) {
				trav = trav.next;
			}
			trav.next = newNode;
		}
	}

	public void addAtPos(int val, int pos) {
		// spl 4. invalid pos( < 1)
		if (pos < 1) {
			throw new RuntimeException("Invallid Position " + pos);
		}
		// spl 1. if List is Empty OR
		// then add at Position first

		if (head == null || pos == 1) {
			addFirst(val);
		} else {
			// create a node

			Node newNode = new Node(val);
			// traverse till (pos -1)

			Node trav = head;

			for (int i = 1; i < pos - 1; i++) {
				// spl3. if pos to add is beyond lenght of list , thorw error

				if (trav == null) {
					new RuntimeException("Invalid pos " + pos);
				}
				trav = trav.next;
			}
			// add noe at that position

			newNode.next = trav.next;
			trav.next = newNode;
		}
	}

	public void detAtPos(int pos) {
		// spl. 3: if (pos < 1) throw exception
		if (pos < 1) {
			throw new RuntimeException("Invalid positon " + pos);
		}
		// spl 1 : List is empty & pos == 1

		if (head == null || pos == 1) {
			delFirst();
		} else {
			Node trav = head;

			for (int i = 1; i < pos - 1; i++) {
				// spl 4: if pos > length , throw exception

				if (trav == null) {
					throw new RuntimeException("Invalids positons " + pos);
				}
				trav = trav.next;
			}
			Node temp = trav.next;
			// spl 5: if temp is null , throw exception
			if (temp == null) {
				throw new RuntimeException("Invalids positons " + pos);
			}
			trav.next = temp.next;
		}
	}

	public void Display() {

		System.out.println("Singly List: ");

		Node trav = head;
		while (trav != null) {
			System.out.print(trav.data + " , ");
			trav = trav.next;
		}
		System.out.println();

	}

	public void delFirst() {
		if (head == null) {
			throw new RuntimeException("List is empty");
		}
		head = head.next;
	}

	public void deleteAll() {
		while (head != null) {
			delFirst();
//			head = null;    second logic
		}
	}

	public void deltLast() {
		// spl1 : list is empty
		// spl2 : list is having only one node

		if (head == null || head.next == null) {
			delFirst();
		}

		Node temp = null, trav = head;

		while (trav.next != null) {
			temp = trav;
			trav = trav.next;
		}
		temp.next = null;
	}
}

public class SinglyListMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int choice;
		int val;
		int pos;
//		boolean exit = false;

		// object

		Singly obj = new Singly();

		do {
			System.out.println("0 . Exit");
			System.out.println("1 . Add First");
			System.out.println("2 . Add Last");
			System.out.println("3 . Add at Position");
			System.out.println("4 . Delete First");
			System.out.println("5 . Delete Last");
			System.out.println("6 . Delete At position");
			System.out.println("7 . Delete all");
			System.out.println("8 . Display ");
			System.out.println("Please Enter your choice   	");

			choice = sc.nextInt();

			switch (choice) {
			// we handel this case (exit = 0) in while block

			/*
			 * case 0: // 0 . Exit if(exit == true) break;
			 * 
			 * break;
			 */
			case 1: // 1. Add First
				System.out.println("Enter the element : ");
				val = sc.nextInt();
				obj.addFirst(val);

				break;

			case 2: // 2 . Add Last
				System.out.println("Enter the element : ");
				val = sc.nextInt();
				obj.addLast(val);
				break;

			case 3: // 3 . Add at Position
				System.out.println("Enter the element : ");
				val = sc.nextInt();
				System.out.println("Enter the Position :");
				pos = sc.nextInt();

				obj.addAtPos(val, pos);
				break;
			case 4: // 4 . Delete First
				obj.delFirst();
				break;

			case 5: // 5 . Delete Last
				obj.deltLast();
				break;

			case 6: // 6 . Delete At position
				System.out.println("Enter the Position :");
				pos = sc.nextInt();
				obj.detAtPos(pos);
				break;

			case 7: // 7 . Delete all
				obj.deleteAll();
				break;

			case 8: // 8 . Display
				obj.Display();
				break;

			}
		} while (choice != 0);
		sc.close();
	}

	/*
	 * // This is hardcoded values public static void main(String[] args) { Singly
	 * s1 = new Singly(); s1.addLast(11); s1.addLast(13); s1.addLast(17);
	 * s1.addFirst(49); s1.addFirst(88); s1.addFirst(77); s1.Display(); //
	 * s1.addAtPos(555, 1); // s1.addAtPos(3838, 8); // s1.delFirst(); //
	 * s1.Display(); s1.detAtPos(4); s1.Display();
	 * 
	 * 
	 * 
	 * s1.deltLast(); s1.Display();
	 * 
	 * s1.deleteAll(); s1.Display(); }
	 * 
	 */

}
