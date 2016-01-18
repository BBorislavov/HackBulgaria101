package week3Monday;



public class getMinElementArr
{
	public static<T extends Comparable<T>> T minElement(T[] arr)
	{
		T min = arr[0] ;
		for(int i=0 ; i<arr.length ; i++)
		{
			if(min.compareTo(arr[i]) > 0)
			{
				min=arr[i] ; 
			}
		}
		return min ; 

	}
	
	
	
	public static void main(String[] args)
	{
		System.out.println(minElement(new Integer[] {8, 4 , 6 , 7 , 2}));
		System.out.println(minElement(new Double[] {1.2 , 2.3 , 0.3}));
		System.out.println(minElement(new String[] {"bobi" , "borislav" }));
	}

}
