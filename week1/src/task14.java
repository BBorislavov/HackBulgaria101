import java.util.Scanner;
public class task14 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in) ; 
		System.out.println("Input arraySize"); ; 
		int arraySize=sc.nextInt() ; 
		int[] array=new int[arraySize] ;
		
		for(int i=0 ; i<arraySize ; i++)
		{
			System.out.println("Input elements " + i + " in array");
			array[i]=sc.nextInt() ; 
		}
		int maxSpan=0;
		for(int i=0 ; i<array.length-1 ; i++)
		{
			for(int j=i+1 ; j<array.length; j++)
			{
				if(array[i]==array[j])
				{
					if(j-i+1>maxSpan)
					{
						maxSpan=j-i+1;
					}
				}
			}
		}
		System.out.println(maxSpan);

	}
		
}
