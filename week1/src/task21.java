import java.util.Arrays;
import java.util.Scanner;

public class task21 
{
	static String copyEveryChar(String input, int k)
	{
		
			String helper = "" ;
			for(int i=0 ; i< input.length() ; i++)
			{
				for(int j=0 ; j<k ; j++)
				{
					helper+=input.charAt(i) ; 
					
				}
			}
				return helper ; 
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in) ; 
		System.out.println("Input string");
		String str=sc.nextLine() ; 
		System.out.println("Input 'k'");
		int k = sc.nextInt() ; 
		System.out.println(copyEveryChar(str , k));
	}

}
