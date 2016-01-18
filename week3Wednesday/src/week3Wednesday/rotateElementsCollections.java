package week3Wednesday;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class rotateElementsCollections 
{

	public static void main(String[] args)
	{
		 List list = Arrays.asList("one Two three Four five six".split(" "));
		System.out.println("List before rotate: " + list);
		Collections.rotate(list, 3);
		System.out.println("List after rotate: " + list);

	}

}
