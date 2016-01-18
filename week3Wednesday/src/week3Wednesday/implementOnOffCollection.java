package week3Wednesday;

import java.util.HashSet;

class MyHashSet<T> extends HashSet<T>
{
	@Override
	public boolean add(T e) 
	{
		if(super.contains(e))
		{
			super.remove(e) ; 
			return false ; 
		}
		else
		{
			super.add(e);
		}
		return true;
		
	}
}



public class implementOnOffCollection 
{
	

	public static void main(String[] args) 
	{
		MyHashSet<Integer> myHS=new MyHashSet<>() ; 
		myHS.add(5) ; 
		myHS.add(5) ; 
		myHS.add(3) ; 
		for(Integer elements : myHS)
		{
			System.out.println(elements);
		}
	}

}
