package com.ds.stack;

import java.util.Scanner;

class Stack{
	private int [] arr;
	private int top;
	
	
	public Stack(int size) {
		arr = new int [size];
		top = -1;
	}
	
	public void push(int val) {
		top ++;
		arr[top] = val;
	}
	
	public void pop() {
		top--;
	}
	
	public int peek() {
		return arr[top];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	public boolean isFull() {
		return top ==  arr.length-1;
	}
}
public class StackMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Stack s = new Stack(5);
		int choice;
		int val;
		do {
			
			System.out.println("1 : push ");
			System.out.println("2 : pop ");
			System.out.println("3 : peek ");
			 choice = sc.nextInt(); 
			 
			 switch (choice) {
			case 1:
				if(s.isFull())
				{
					System.out.println("Stack is full");
				}
				else
				{
					System.out.println("enter element to push");
					
					val = sc.nextInt();
					s.push(val);
				}
				break;
			case 2: // pop
				
				if(s.isEmpty())
				{
					System.out.println("Stack is Empty");
				}
				else
				{
					val=s.peek();
					s.pop();
					System.out.println("poped elment is "+ val);
				} 
				
				break;
			case 3:  //peek
				if(s.isEmpty())
				{
					System.out.println("Stack is Empty");
				}
				else
				{
					val=s.peek();
					s.pop();
					System.out.println("topmost elment is "+ val);
				} 
				
				break;

			}
		}
		while(choice != 0);
		
		sc.close();

	}

}
