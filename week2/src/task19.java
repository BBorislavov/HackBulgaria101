import java.util.Scanner;
import java.util.Arrays;

public class task19
{
	static boolean IsIncreasing(int[] sequence)
	{
		for(int i=0 ; i<sequence.length-1 ; i++)
		{
			if(sequence[i] < sequence[i+1])
			{
				return true ; 
			}
			if(sequence[i] > sequence[i+1])
			{
				return false ;
			}
		}
		return true ;
	}
	
	static boolean IsDecreasing(int[] sequence)
	{
		for(int i=0 ; i<sequence.length-1 ; i++)
		{
			if(sequence[i] > sequence[i+1])
			{
				return true ; 
			}
			if(sequence[i] < sequence[i+1])
			{
				return false ;
			}
		}
		return true ;
	}
	
	

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.print("Input array size : ");
		int arrSize = sc.nextInt() ; 
		int[] array = new int[arrSize] ;
		for(int i=0 ; i<arrSize ; i++)
		{
			System.out.print("Input " + i + " element : ");
			array[i]=sc.nextInt() ; 
		}
		 System.out.println("Is increasing : "  + IsIncreasing(array));
		 System.out.println("Is decreasing : " + IsDecreasing(array));
			
		
		
	}
	
}
