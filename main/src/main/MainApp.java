package main;

//import DoublyList.Node;

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
			System.out.print(trav.data + " , ");
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
		this.count++;
	}
	
	public void addFirst(int val)
	{
		Node newNode = new Node(val);
		
		if(head == null)
		{
			head = newNode;
		}
		else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
			
		}
		this.count++;
	}
	
	public void addAtPos(int val, int pos)
	{
		// spl 3: add at last position
		if(pos == count + 1)
		{
			addLast(val);
		}
		
		// spl 4: Invalid position
		
		else if(pos < 1 || pos > count + 1)
		{
			throw new RuntimeException("invalid positon "+ pos);
		}
		
		
		// spl 1: list is empty 
		// spl 2: pos is 1
		
		if(head == null || pos == 1)
		{
			addFirst(val);
		}
		else
		{
			Node newNode = new Node(val);
			// travsersse till pos -1
			
			Node trav = head;
			for(int i =1; i< pos-1 ; i++)
			{
				trav = trav.next;
			}
			// mark its next node as temp
			
			Node temp = trav.next;
			
			// add newNode between trav & temp
			
			newNode.next = temp;
			newNode.prev = trav;
			trav.next = newNode;
			temp.prev = newNode;	
			
			
			this.count ++;
		}
		
	}
	
	public void delFirst()
	{
		//spl1: list is empty
		if(head == null)
		{
			throw new RuntimeException("List is empty ");
		}
		// spl 3: if list have onlu one node
		
		if(head.next == null)
		{
			head = null;
		}
		else
		{
			head = head.next;
			head.prev = null;
		}
		
		this.count--;
	}
	
	
	public void delAtPos(int pos )
	{
		// spl 1: list is empty or 
		// spl 2: pos =1
		
		if(head == null || pos == 1)
		{
			delFirst();
		}
		else
		{
			//traverse till pos
			
			Node trav = head;
			for(int i =1; i< pos; i++)
			{
				trav = trav.next;
			}
			//delete trav node
			
			trav.prev.next = trav.next;
			
			// spl4: if not last node to delete
			if(trav.next != null )
			{
				trav.next.prev = trav.prev;
			}
			
			this.count--;
			
		}
	}
	
	public void delLast()
	{
		
	}
	
	
	public void delAll()
	{
		if(head.next != null)
		{
			delFirst();
		}
	}
	
	
}


public class MainApp {

	public static void main(String[] args) {
		
		DoublyList obj = new DoublyList();
		
		obj.addLast(11);
		obj.addLast(21);
		obj.addLast(51);
		obj.addLast(101);
		obj.Display();

	}

}