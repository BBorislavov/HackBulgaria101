import java.util.Scanner;
public class task6 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in) ;
		int fact1 = 1;
		int fact2= 1;
		 System.out.println("Enter an integer ");
		int n=sc.nextInt() ; 
		 if(n<0)
		 {
			 System.out.println("Number should be non-negative.");
		 }
		 
	      for (int i = 1 ; i <= n ; i++ )
	      {
	    	  fact1 = fact1*i;
	      }
	  
		 for(int i = 1 ; i <= fact1 ; i++)
		 {
			 fact2 = fact2*i ;
		 }
		 System.out.println("Factorial of "+n+" is = "+fact2);
		 
	}

}
