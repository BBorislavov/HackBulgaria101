package week3Wednesday;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class uniqueElement 
{

	public static void main(String[] args) 
	{
		List<String> list = new LinkedList<String>();
		for(int i=0 ; i<10 ; i++)
		{
			list.add(String.valueOf(i)) ; 
		}
		for(int i=0 ; i<5 ; i++)
		{
			list.add(String.valueOf(i)) ; 
		}
		
		System.out.println("My List : " + list);
		System.out.println("\nHere are the duplicate elements from list : " + findUniqueElements(list));

	}
	
	public static String findUniqueElements(List<String> inputElements) 
	{
		ArrayList<String> resultList = new ArrayList<>();  
		
		for (String yourInt : inputElements) 
		{
			
			int counter=numberOfDuplicate(inputElements,yourInt) ;
			if(counter == 1)
			{
				return yourInt ; 
			}
			
		}
		return null;
	}
	
	public static int numberOfDuplicate(List<String> inputElements ,String yourInt)
	{
		int counter = 0 ; 
		for (String i : inputElements)
		{
			if(i.equals(yourInt) )  
			{
				counter++  ;
			}
		}
		return  counter ; 
	}
}
	


