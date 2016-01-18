import java.util.Arrays;
import java.util.Scanner;

public class task12
{   
	
	static int getOddOccurrence(int[] array)
	{
		int counter=1 ; 
		for(int i=0 ; i<array.length ; i++)
		{
			 for(int j=1 ; j<array.length ; j++)
			{
				if(array[i]==array[j])
				{
					counter++ ; 
				}	
				 
			}
			 if(counter%2==1)
			 {
				 return array[i] ;
			 }
			 counter=1 ;
			
		}
         return -1 ;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in) ; 
		int size = sc.nextInt() ; 
		int[] array=new int[size] ; 
		for(int i=0 ; i<size ; i++)
		{
			System.out.println("Enter [" + i +  "]");
			array[i]=sc.nextInt() ; 
		}
		System.out.println(Arrays.toString(array));
		
		System.out.println(getOddOccurrence(array));
		
	}

}
