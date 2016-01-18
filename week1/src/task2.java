import java.util.Scanner;

public class task2
{
	static boolean isPrime(int N)
	{
		if(N==2)
		{
			return true ; 
		}
		 for(int i=2;i<=(int)Math.sqrt(N)+1;i++)
		 {
			 if(N%i==0)
			 {
				 return false ; 
			 }
		 }
		 return true ; 
		
	}
	

	public static void main(String[] args) 
	{
		
		System.out.println(isPrime(5));
		
	}

}
