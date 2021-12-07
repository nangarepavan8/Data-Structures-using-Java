//import Singly.Node;

class SinglyCicularList {
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
	// head == Node -> head is always pointing to next Node

	private Node head;
	private int count;

	public SinglyCicularList() {
		head = null;
		count = 0;
	}

	public void Display() {

		System.out.println("Singly Circular List :");
		if (head != null) {
			Node trav = head;

			do {
				System.out.println(trav.data + " , ");
				trav = trav.next;
			} while (trav != head);

		}

		System.out.println();

	}

	public void addLast(int val) {
		// crate new node
		Node newNode = new Node(val);
		// spl 1: list is empty
		if (head == null) {
			// add node at the start of the list

			head = newNode;

			// make it circular
			newNode.next = head;
		} else {
			// traverse till last node

			Node trav = head;

			while (trav.next != head) {
				trav = trav.next;
			}
			// newNodes next to head
			newNode.next = head;
			// last nodes next to new Node
			trav.next = newNode;
		}
		count++;
	}

	public void addFirst(int val) {
		// crate new node
		Node newNode = new Node(val);
		// spl 1: list is empty
		if (head == null) {
			// add node at the start of the list

			head = newNode;

			// make it circular
			newNode.next = head;
		} else {
			// traverse till last node

			Node trav = head;

			while (trav.next != head) {
				trav = trav.next;
			}
			// newNodes next to head
			newNode.next = head;
			// last nodes next to new Node
			trav.next = newNode;
		}
		// head should point to the new Node
		head = newNode;

		count++;
	}

	public void addAtPos(int val, int pos) {
		// spl. 3: if (pos < 1) throw exception
		if (pos < 1 || pos > count) {
			throw new RuntimeException("Invalid positon " + pos);
		}
		// spl 1 : List is empty & pos == 1

		if (head == null || pos == 1) {
			addFirst(val);
		} else {
			Node newNode = new Node(val);

			Node trav = head;

			for (int i = 1; i < pos - 1; i++) {

				trav = trav.next;
			}
			newNode.next = trav.next;
			trav.next = newNode;
			count++;
		}
		
	}

	public void delFirst() {

		// spl 1 : list is empty
		
		if(head  ==  null)
		{
			throw new RuntimeException("List is empty");
		}
		// spl 2: list contain only one element.
		if(head == head.next)
		{
			head = null;
		}
		else
		{
			//traverse till last node
			Node trav = head;
			while(trav.next != head )
			{
				trav = trav.next;
			}
			// take to the next code (2nd)
			head = head.next;
			
			//last node next to the new head
			trav.next = head;
			
			
		}
	}

	public void delLast() {

	}

	public void delAtPos(int val, int pos) {
	
		
	}

	public void deleteAll() {
		
		if(head == null || head.next == head)
		{
			head = null;
		}
		else
		{
			//conver circular list to liner list
			
			Node temp = head;
			head = head.next;
			
			temp.next = null;
			
			//delete all nodes in linear list
			while(head != null)
			{
				temp = head ;
				head = head.next;
				temp.next = null;
				
			}
		}

	}

}

public class SinglyCircular {

	public static void main(String[] args) {

		SinglyCicularList obj = new SinglyCicularList();

		obj.addFirst(23);
		obj.addLast(17);
		obj.addFirst(88);
		obj.Display();
		obj.addAtPos(55, 3);
		obj.Display();
	}

}
