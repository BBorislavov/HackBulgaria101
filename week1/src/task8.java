import java.util.Scanner; 
import java.util.Arrays; 
public class task8 
{
	static long getSmallestMultiple(int upperBound)
	{
		int sum= 1;
		for(int i = 1 ; i<=upperBound ; i++)
		{
			sum=sum*i ;
		}
		return sum ; 
	}
	
	public static void main(String[] args) 
	{
		
		System.out.println(getSmallestMultiple(4));
		
	} 

}
