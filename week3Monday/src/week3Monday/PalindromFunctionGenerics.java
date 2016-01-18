package week3Monday;

public class PalindromFunctionGenerics 
{
	
	public static<T> boolean reverseMe(T input)
	{
		String helper = input.toString() ; 
		String res = new StringBuilder(helper).reverse().toString() ; 
		return helper.equals(res) ;
	}
	

	public static void main(String[] args)
	{
		System.out.println(reverseMe(new String("bob")));

	}

}
