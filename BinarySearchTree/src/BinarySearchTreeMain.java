
class BinarySearchTree {

	static class Node {
		private int data;
		private Node left;
		private Node right;

		public Node() {
			data = 0;
			left = null;
			right = null;
		}

		public Node(int val) {
			data = val;
			left = null;
			right = null;
		}

	}
	
	
	private Node root;
	
	public BinarySearchTree() {
		root = null;
	}
	
	
		public void add(int val) {
			Node nn = new Node(val);
			if (root == null)
				root = nn;
			else {
				Node trav = root;
				while (true) {
					if (val < trav.data) {
						if (trav.left == null) {
							trav.left = nn;
							break;
						} else
							trav = trav.left;
					} else {
						if (trav.right == null) {
							trav.right = nn;
							break;
						} else {
							trav = trav.right;
						}
					}
				}
			}
		}

	
		public void addByRecursion(Node trav ,int val) {
			//Node nn=new Node();
			//Node trav=root;
			if(val<trav.data) {
				if (trav.left == null) {
					trav.left = new Node(val);
				}
				else
					addByRecursion(trav.left, val);
			}
			if (trav.right== null) {
				trav.right = new Node(val);
			}
			else
				addByRecursion(trav.right, val);
			
		}
		public  void addByRecursion(int val) {
			if (root==null)
				root = new Node(val);
				addByRecursion(root,val);
		}

	public void recPreOrder() {
		
	}
	public void recInOrder() {
		
	}
	public void recPostOrder() {
		
	}
}

public class BinarySearchTreeMain {

	public static void main(String[] args) {

		BinarySearchTree bst = new BinarySearchTree();
		
//		bst.add(50);
//		bst.add(30);
//		bst.add(10);
//		bst.add(90);
//		bst.add(100);
//		bst.add(40);
//		bst.add(70);
//		bst.add(20);
//		bst.add(60);
//		bst.add(80);
//		
		
		bst.addByRecursion(50);
		bst.addByRecursion(30);
		bst.addByRecursion(10);
		bst.addByRecursion(90);
		bst.addByRecursion(100);
		bst.addByRecursion(40);
		bst.addByRecursion(70);
		bst.addByRecursion(20);
		bst.addByRecursion(60);
		bst.addByRecursion(80);

		
		bst.recPreOrder();
		
	}

}
