
class CircularQueue{
	
	private int []  arr;
	private int front , rear;
	private int count;
	
	public CircularQueue(int size)
	{
		arr = new int [size];
		front = -1;
		rear = -1;
		count=0;
		
	}
	//push 
	public void push(int val) {
		rear = (rear +1)  % arr.length;
		arr[rear] = val;
		
		//add count
		count++;
		
	}
	
	//pop
	public void pop() {
		front = (front + 1) % arr.length;
		/*
		if(front == rear)
		{
			front = -1;
			rear = -1;
		}
		*/
		count --;
	} 
	
	//peek
	public int peek() {
		int index =(front +1 ) % arr.length;
		return arr[front + 1 ];
	}
	
	//isEmpty
	public boolean isEmpty() {
//		return (front == rear && front == -1);
		return count ==0;
	}

	//isFull
	public boolean isFull() {
		/*
		return (front == -1 && rear == arr.length -1) &&
				 (front == rear && front != -1);
				 */
		
		return count == arr.length;
	}
}


public class CircularMain {

	public static void main(String[] args) {
		
		CircularQueue q = new CircularQueue(6);
		
		if(!q.isFull())
			q.push(11);
			
		if(!q.isFull())
			q.push(22);
		
		if(!q.isFull())
		   q.push(33);
		
		if(!q.isFull())
		q.push(44);
		
		if(!q.isFull())
		q.push(55);
		
		if(!q.isFull())
		q.push(66);
		

		System.out.println("Element at front "+ q.peek());
		
		while(!q.isEmpty()) {
			System.out.println("Pooping:"+ q.peek());
			q.pop();
		}

	}

}