import java.util.Arrays;
import java.util.Scanner;

public class task3
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in) ;
		int size=sc.nextInt() ; 
		int min=Integer.MAX_VALUE ; 
		int array[]=new int[size] ; 
		for(int i=0 ; i<size ; i++)
		{
			System.out.println("Enter the elements in array");
			array[i]=sc.nextInt();
			if(array[i]<min)
			{
				min=array[i];
			}
		}
		System.out.println(Arrays.toString(array));
		System.out.println("Min element in array is:" + min);
		
	}

}
