package week3Wednesday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;



public class DuplicateValues 
{

	public static void main(String[] args) 
	{
		List<String> list = new LinkedList<String>();
		
		for(int i=0 ; i<9 ; i++)
		{
			list.add(String.valueOf(i)) ; 
		}
		for(int i=0 ; i<7 ; i++)
		{
			list.add(String.valueOf(i)) ; 
		}
		
		
		System.out.println("My List : " + list);
		System.out.println("\nHere are the duplicate elements from list : " + findDuplicates(list));
		
		
	}
	
	public static ArrayList<String> findDuplicates(List<String> listContainingDuplicates) 
	{
		ArrayList<String> resultList = new ArrayList<>();  
		

		for (String yourInt : listContainingDuplicates) 
		{
			
			int counter=numberOfDuplicate(listContainingDuplicates,yourInt) ;
			if(counter > 1)
			{
				if(!resultList.contains(yourInt))
				{
					resultList.add(yourInt);
				}
		
			}
			
			
		}
		return  resultList;
	}
	
	public static int numberOfDuplicate(List<String> listContainingDuplicates ,String yourInt)
	{
		int counter = 0 ; 
		for (String i : listContainingDuplicates)
		{
			if(i.equals(yourInt) )  
			{
				counter++  ;
				
			}
		}
		return  counter ; 
	}
	
	
}

