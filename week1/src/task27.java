import java.util.Scanner;

public class task27
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first word");
		String str1 = sc.nextLine() ; 
		System.out.println("Input second word");
		String str2 = sc.nextLine() ; 
		
		
		String helper="" ; 
		for(int i=0 ; i<str1.length() ; i++)
		{
			for(int j= 0 ; j<str2.length() ; j++)
			{
				if(str1.charAt(i)==str2.charAt(j))
				{
					helper+=str1.charAt(i) ; 
					
					System.out.println(helper);
					break ; 
				}	
			}
			
		}
		if(helper.equals(str1))
		{
			System.out.println("is anagram");
		}
		else 
		{
			System.out.println("is not anagram");
		}
		

	}

}