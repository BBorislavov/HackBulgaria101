import java.util.Scanner; 
import java.util.Arrays; 
public class task18 
{
    static String reverseEveryChar(String arg)
    {
    	return    new StringBuffer(arg).reverse().toString();
    	
    }
	

	public static void main(String[] args)
	{
		
		    Scanner sc=new Scanner(System.in);
			String str=sc.nextLine();
			String words[]=str.split(" ");
			words[0]=words[0].trim();
			words[1]=words[1].trim();
			words[2]=words[2].trim();
	        
	        
	        System.out.println(reverseEveryChar(str));
	}

}
