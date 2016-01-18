import java.util.Arrays;
import java.util.Scanner; 
public class task10 
{
	
	static int[] histogram(short[][] image)
	{
		
		int[] histogram=new int[256] ; 
		
		for(int i = 0 ; i<image.length; i++)
		{
			
			for(int j = 0 ; j<image[i].length ; j++)
			{
				histogram[image[i][j]]++ ; 
			}
			
		}
		return histogram ;
		
	}
	

	

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ; 
		int rows = sc.nextInt() ; 
		int cols = sc.nextInt() ; 
		short[][] image = new short[rows][cols] ; 
		for(int i = 0 ; i<rows ; i++)
		{
			for(int j = 0 ; j<cols ; j++)
			{
				System.out.println("Enter [" + i + "][" + j + "]");
				image[i][j] = sc.nextShort() ; 
			}
			
		}
		System.out.println(Arrays.toString(histogram(image)));
		
	}
	

}
