import java.util.Scanner;
import java.util.Arrays;

public class task22 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in) ; 
		int counter=0 ; 
		System.out.print("Enter words with comma :");
		String str=sc.nextLine();
		String words[]=str.split(",");
		for(int i=0 ; i<words.length ; i++)
		{
			words[i] = words[i].trim() ; 
		}
		
		for(int i=0 ; i<words.length-1 ; i++)
		{
			boolean flag=true ; 
			for(int j=i+1; j<words.length ; j++)
			{
				if(words[i]==words[j])
				{
					flag=false ;
				}
			}
			if(flag)
			{
				counter++ ; 
			}
		}
		
		System.out.println("The number of different words is : "  + counter);
	}

}