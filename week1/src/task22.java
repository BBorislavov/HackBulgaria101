import java.util.Scanner;
public class task22 
{
	static int getPalindromeLength(String input)
	{
		int counter=0 ;
		  for(int i=0 ; i<input.length() ;i++)
		  {
			  if(input.charAt(i)=='*')
			  {
				  if(isPalindrome(input.substring(0, i)) ) 
				  {
					  counter++ ; 
				  }
				  if(isPalindrome(input.substring(i+1,input.length()))) 
				  {
					  counter++ ; 
				  }
			  }
		  }
		  return counter ;
		
		
	}
	
	static boolean isPalindrome(String argument)
	{
		boolean flag=true ; 
		for(int i=0 ; i<argument.length()/2 ; i++)
		{
			if(argument.charAt(i) != argument.charAt(argument.length()-i-1))
			{
				flag=false;
				break;
			}
		}
		return flag ; 
	}
	
	
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in) ;
		String str=sc.nextLine();
		System.out.println(getPalindromeLength(str));
	}
  
}
