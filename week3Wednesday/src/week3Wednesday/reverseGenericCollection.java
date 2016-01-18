package week3Wednesday;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator; 
import java.util.ListIterator;

public class reverseGenericCollection 
{
	

	public static void main(String[] args)
	{
		ArrayList arr1list = new ArrayList() ; 
				
		arr1list.add("A") ; 
		arr1list.add("B") ; 
		arr1list.add("C") ; 
		arr1list.add("D") ; 
		arr1list.add("E") ; 
		
		 System.out.println("The initial list is :"+arr1list);
		 
		 Collections.reverse(arr1list) ;
		 
		 System.out.println("The Reverse List is :"+arr1list);
	}

}
