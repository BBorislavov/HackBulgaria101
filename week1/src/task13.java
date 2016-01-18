import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class task13
{
  

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in) ; 
		int size = sc.nextInt() ; 
		int[] arr1 = new int[size] ; 
		int[] arr2 = new int[size] ; 
		for(int i= 0 ; i<arr1.length ; i++) 
		{
			System.out.println("Enter the elements in arr1");
			arr1[i]=sc.nextInt() ; 
		}
		
		for(int i= 0 ; i<arr1.length ; i++) 
		{
			System.out.println("Enter the elements in arr2");
			arr2[i]=sc.nextInt() ; 
		}
		
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		int sum=0;
		for(int i=0 ; i<arr1.length ; i++)
		{
			for(int j=0 ; j<arr2.length ; j++)
			{
				sum=arr1[i]*arr2[j] ; 
			}
		}
		System.out.println(sum);
		
	}

}