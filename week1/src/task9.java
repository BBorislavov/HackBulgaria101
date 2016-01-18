import java.util.Arrays;
import java.util.Scanner;

public class task9 
{
	
	static long getLargestPalindrome(long N)
	{
		while(!isPalindrome(N))
		{
			--N ; 
		}
		return N ;
	}
	
	
	
	
	static boolean isPalindrome(long number)
	{
		long  palindrome = number; 
        long  reverse = 0;
        
        while(palindrome != 0)
        {
        	long reminder = palindrome%10 ;
        	reverse = reverse * 10 + reminder ; 
        	palindrome  = palindrome/10 ; 
        }

        if(number==reverse)
        {
        	return true;
        }
        return false;

		
	}
	
	
	public static void main(String[] args) 
	{
		
		System.out.println(getLargestPalindrome(130));
	}

}
