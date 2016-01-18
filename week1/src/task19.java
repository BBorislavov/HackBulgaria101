
public class task19 
{
	static boolean isPalindrome(int number)
	{
		int  palindrome = number; 
        int  reverse = 0;
        
        while(palindrome != 0)
        {
        	int reminder = palindrome%10 ;
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
		System.out.println(isPalindrome(131));
		
	}

}
