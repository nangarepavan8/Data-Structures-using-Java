package com.stack;

import java.util.Stack;

public class ParanthesiMain {
	public static boolean  isParanthesisBalance(String expr)
	{
		 Stack<Character>  s= new Stack<Character>();
		 
		 String open = "([{<";
		 String close= ")]}>";
		 
		 int index;
		 
		 for(int i=0; i<expr.length(); i++)
		 {
			 char sym = expr.charAt(i);
			 index = open.indexOf(sym);
			 
			 if(index != -1)  // opening of parathemsis
			 {
				 s.push(sym);
			 }
			 else
			 {
				 index = close.indexOf(sym);
				 
				 if(index != -1)        // id closing parenthesis
				 {
					 if(s.isEmpty())  // not balanced -- extra closing
					 {
						 return false;
					 }
					 
					 char top = s.pop();
					 
					 if(open.indexOf(top) != index) // not balanced
					 {
						 return false;
					 }
				 }
				 else
				 {
					 
				 }
			 }
		 
		 
		 
		 }
		 
		 
		 
		
		if(!s.isEmpty())
		{
			return false;   // not balanced -- extra opening
		}
		return true;  // balanced
		
	}

	public static void main(String[] args) {
		
		String expr  = "5+([9-4]*(8-{6/2}))";
		
		if(isParanthesisBalance(expr))
		{
			System.out.println("Parethensis are balanced");
		}
		else
		{
			System.out.println("Parethensis are nnot balanced");
		}
	}

}
