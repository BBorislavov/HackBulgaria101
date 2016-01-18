package week3Wednesday;

import java.util.Stack;

public class CorrectBreckets 
{
	public static boolean  correctBreckets(String input)
	{
		Stack<Character> breckets = new Stack<Character>() ; 
		for(int i=0 ; i<input.length() ; i++)
		{
			if(input.charAt(i)=='(') 
			{
				breckets.push(input.charAt(i)) ; 
			}
			else 
			{
				if(breckets.isEmpty())
					return false ; 
				breckets.pop() ; 
			}
				
		}
		return breckets.isEmpty() ; 
	}
	

	public static void main(String[] args) 
	{
		String input = "((()))" ; 
		System.out.println(correctBreckets(input));
	}

}
