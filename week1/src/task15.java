import java.util.Scanner;


public class task15 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Input array size with odd number");
		int sum1=0;
		int sum2=0;
		int arrSize = sc.nextInt() ; 
		int[] array = new int[arrSize] ; 
		for(int i=0 ; i<arrSize ; i++)
		{
			System.out.println("Input " + i + " : ");
			array[i]=sc.nextInt() ; 
		}
		for(int i=0 ; i<arrSize/2 ;i++)
		{
			sum1+=array[i] ; 
		}
		for(int i=arrSize/2+1 ; i<arrSize ; i++)
		{
			sum2+=array[i];
		}
		if(sum1==sum2)
		{
			System.out.println("can Balance");
		}
		else
		{
			System.out.println("can`t Balance");
		}
				
	}

}