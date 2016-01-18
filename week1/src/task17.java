import java.util.Scanner; 
import java.util.Arrays; 
public class task17 
{
    static String reverseMe(String argument)
    {
    	return    new StringBuffer(argument).reverse().toString();
    	
    }
	

	public static void main(String[] args)
	{
		 String str,rev;
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the string : ");
	        str = sc.nextLine();
	        
	        System.out.println(reverseMe(str));
	}

}
