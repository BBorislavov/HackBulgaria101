import java.util.Scanner;

public class task18 
{
	public static int nthLucas(int number)
	{
		if(number<0)
		{
			return -1 ;
		}
		
		else if(number == 0)
        {
            return 2;
        }
		
		else if(number == 1)
        {
        	return 1 ; 
        }
		
		else 
		{
			return nthLucas(number-1) + nthLucas(number-2) ; 
		}
    }     
	
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in) ;
		System.out.print("Input number : ");
		int num = sc.nextInt() ; 
	
		System.out.println(nthLucas(num));

	}

}