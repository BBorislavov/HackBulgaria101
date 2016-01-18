package week3Wednesday;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class countWordsInText {
	public static void main(String[] args) {
		util u1= new util() ;
		u1.print(); 
	}
	
}

 class util{
	String str = "I am a Boy I am a";
	String[] splitStr = str.split(" ");

	Map<String, Integer> wordCount = new HashMap<>();
	{
		for (String word : splitStr)
		{
			if (wordCount.containsKey(word)) 
			{
				wordCount.put(word, wordCount.get(word) + 1);
			} 
			else 
			{
				wordCount.put(word, 1);
			}
		}
		

	}
	
	public  void print()
	{

		for (Entry<String, Integer> entry: wordCount.entrySet()) 
		{
		    System.out.println("Count of : " + entry.getKey() + " in sentence = " + entry.getValue());
		}  
	}
}


