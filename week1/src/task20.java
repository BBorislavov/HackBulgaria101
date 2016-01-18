import java.util.Scanner;

public class task20
{
	
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
		Scanner sc=new Scanner(System.in);
		String words=sc.nextLine() ; 
		
		System.out.println(isPalindrome(words));

	}

}