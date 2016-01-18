import java.util.Scanner;

public class task17 
{
	
	public static int Fibonacci(int number)
	{
        if(number == 1 || number == 2)
        {
            return 1;
        }
        int fibo1=1, fibo2=1, fibonacci=1;
        for(int i= 3; i<= number; i++)
        {
            fibonacci = fibo1 + fibo2; 
            fibo1 = fibo2;
            fibo2 = fibonacci;
 
        }
        return fibonacci;
    }     

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.print("Input number : ");
		int num = sc.nextInt() ; 
		
		for(int i=1 ; i<=num ; i++)
		{
			System.out.print(Fibonacci(i));
		}

	}

}
