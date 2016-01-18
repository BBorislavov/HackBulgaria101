import java.util.Scanner;
public class task11
{
	 public static double pow(long a, long b) {

	        if (b == 0) {
	            return 1;
	        } 
	        if (b < 0) {
	            return pow(a, b + 1)/a;
	        }
	            return a * pow(a, b - 1);
	       

	    }
	
	public static void main(String[] args)
	{	
		
		long a;
		long b;
		double res;
		
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter int a ");
        a = sc.nextLong() ;

        System.out.print("Enter int b ");
        b = sc.nextLong();

        res = pow(a, b);

        System.out.print(res);

	}

}
