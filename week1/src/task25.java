import java.util.Arrays;
import java.util.Scanner;

public class task25 
{
	 static int sumOfNumbers(String input)
	{
		  String[] stringArray = input.split("");
		    int sum=0;
		    int temp=0;
		    for(int i=0;i<stringArray.length;i++){
		        try{
		            
		            temp = Integer.parseInt(stringArray[i]);
		            sum += temp;
		        }catch(Exception e){
		            
		        }
		    }
		    return sum;
		
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in) ; 
		System.out.println("Input string with numbers");
		String str=sc.nextLine();
		System.out.println(sumOfNumbers(str));
		
	}

}
