import java.util.Scanner;

public class task20 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in) ; 
		
		int counter = 1 ; 
		int max=0 ; 
		
		System.out.print("Input array size : ");
		int arrSize = sc.nextInt() ; 
		int[] array = new int[arrSize] ;
		for(int i=0 ; i<arrSize ; i++)
		{
			System.out.print("Input " + i + " element : ");
			array[i]=sc.nextInt() ; 
		}
		for(int i=0 ; i<arrSize-1 ; i++)
		{
			
				if(array[i]==array[i+1])
				{
					
					counter++ ; 
					if(max<counter)
					{
						max=counter; 
					}
				}
				else
				{
					counter = 1 ; 
				}
			
		}
		System.out.println(max);

	}

}
