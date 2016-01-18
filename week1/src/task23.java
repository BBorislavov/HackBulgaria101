import java.util.Scanner; 
public class task23 
{
	static int countOcurrences(String needle, String haystack)
	{
		int i ;
		int cnt = 0;
		for ( i = 0; i < haystack.length(); i++)
		{
			if (haystack.indexOf(needle) != -1)
			{
				cnt++;
				i = haystack.indexOf(needle)+ needle.length();
			haystack  =	haystack.substring(i);
				
			}
		}
		return cnt;
	}
	

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in) ;
		String str1=sc.nextLine() ; 
		String str2=sc.nextLine() ; 
		
		System.out.println(countOcurrences(str1 , str2));
	}

}
