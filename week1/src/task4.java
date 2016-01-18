import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class task4 
{
	 static int kthMin( int[] array , int k)
	{
		
		Integer[] integerArray = new Integer[array.length] ; 
		for(int i = 0 ; i<array.length ; i++)
		{
			integerArray[i]=new Integer(array[i]);
		}
		Arrays.sort(integerArray,Collections.reverseOrder());
		
		for(int i=0 ; i<array.length ; i++)
		{
			System.out.println("arr: " + integerArray[i] );
		}
		
		return integerArray[k] ; 
		
		
		
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in) ; 
		int k = sc.nextInt() ; 
		int arraySize = sc.nextInt() ; 
		int[] array = new int[arraySize] ; 
		for(int i=0 ; i<arraySize ; i++)
		{
			System.out.println("Enter [" + i +  "]");
			{
				array[i]=sc.nextInt() ; 
			}
		}
		
		System.out.println(kthMin(array,3));

	}

}
