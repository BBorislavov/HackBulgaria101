package week3Monday;

public class FactorialFunction<U extends Number >
{
	private U firstNumber ; 
	

	public FactorialFunction(U firstNumberInput )
	{
		this.firstNumber = firstNumberInput ; 
	
	}
	
	public void setFirstNumber(U firstNumber) 
	{
		this.firstNumber = firstNumber;
	}
	
	public U getFirstNumber()
	{
		return firstNumber;
	}
	
	
	
	
	public static <U extends Number > Number fact(U firstNumber )
	{
		double fact1 = 1 ;
		
		if(firstNumber.doubleValue() < 0)
		 {
			 System.out.println("Number should be non-negative.");
		 }
		 
	      for (int i = 1 ; i <= firstNumber.doubleValue(); i++ )
	      {
	    	  fact1 = fact1*i;
	      }
	  
		
		 
		 return fact1 ; 
		 
	}
	
	public static void main(String[] args) 
	{
		FactorialFunction<? extends Number > number = new FactorialFunction(4) ; 
		System.out.println(fact(number.getFirstNumber()));

	}
	
}