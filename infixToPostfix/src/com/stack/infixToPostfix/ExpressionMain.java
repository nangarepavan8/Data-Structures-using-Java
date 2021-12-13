package com.stack.infixToPostfix;

import java.util.Stack;

public class ExpressionMain {

	public static int pri(char op) {
		switch (op) {
		case '$' : return 10;  // for priority porpose;
		case '*' : return 7;
		case '/' : return 7;
		case '%' : return 7;
		case '+' : return 4;
		case '-' : return 4;
		}
		
		return 0;
	}
	public static String infixToPostfix(String infix)
	{
		Stack<Character> s = new Stack<Character>(); 
		String postfix =" ";
		
		for(int i =0; i<postfix.length(); i++)
		{
			char sym = infix.charAt(i);
			
			if(Character.isDigit(sym))
			{
				postfix = postfix + sym;
			}
			else if(Character.compare(sym, '(')   ==  0)
			{
				s.push(sym);
			}
			else if(Character.compare(sym, ')')   ==  0)
			{
				while(Character.compare(s.peek().charValue(), '(')  != 0)
				{
					postfix = postfix +s.pop();
				}
				s.pop();  
			}
				
			else
			{
				while( !s.isEmpty()   && (s.peek())>= pri(sym))
				{
					postfix = postfix + s.pop();
				}
				s.push(sym);
			}
		}
		
		return postfix;
	}

	public static void main(String[] args) {
		
		String infix = "5+9-4*(8-6/2_)+1$(7-3";
		String postfix = infixToPostfix(infix);
		
		System.out.println("Postfix : "+  postfix );

	}

}
