
class DoublyList{
	
	static class Node{
		
		private int data;
		private Node next;
		private Node prev;
		
		public Node()
		{
			data = 0;
			next = null;
			prev = null;
			
		}
		
		public Node (int val) {
			data = val;
			next = null;
			prev = null;
			
		}		
	}
	
	private Node head;
	private int count;
	
	public  DoublyList() {
		head = null;
		count = 0;
	}
	
	public void Display() {
		Node temp = null;
		// display forword
		System.out.print("Forword List : ");
		
		Node trav = head;
		
		while(trav != null)
		{
			System.out.print(trav.data + " , ");
			temp = trav;
			trav = trav.next;
		}	
		System.out.println();
		
		// display reverse
		
		System.out.print("Reverse List : ");
		
		trav = temp;
		while(trav !=null)
		{
			System.out.println(trav.data + " , ");
			trav = trav.prev;
		}
		System.out.println();
	}
	
	public void addLast(int val) {
		
		Node newNode = new Node(val);
		
		if(head == null)
		{
			head   = newNode;
		}
		else
		{
			Node trav = head;
			while(trav.next != null)
			{
				trav = trav.next;
			}
			trav.next = newNode;
			newNode.prev = trav;
		}
	}
}


public class DublyMain {

	public static void main(String[] args) {
		
		DoublyList obj = new DoublyList();
		
		obj.addLast(11);
		obj.addLast(21);
		obj.addLast(51);
		obj.addLast(101);

	}

}
