import java.util.Scanner;
public class task24 
{
	
	public static String decodeUrl(String input)
	{
		String helper=input.replace("%20", "") ; 
		helper = helper.replace("%3A", ":") ; 
		helper = helper.replace("%3D", "?") ; 
		helper = helper.replace("%2F", "/") ; 
		return helper ; 
		
	}
	
	

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in) ; 
		String str = sc.nextLine() ; 
		
		System.out.println(decodeUrl(str));
	}

}
