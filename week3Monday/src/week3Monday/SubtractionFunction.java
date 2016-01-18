package week3Monday;

public class SubtractionFunction<U extends Number , S extends Number>
{
	private U firstNumber ; 
	private S secondNumber ;
	
	
	
	public SubtractionFunction(U firstNumberInput , S secondNumberInput)
	{
		this.firstNumber = firstNumberInput ; 
		this.secondNumber = secondNumberInput ;
	}
	
	public void setFirstNumber(U firstNumber) 
	{
		this.firstNumber = firstNumber;
	}
	
	public U getFirstNumber()
	{
		return firstNumber;
	}
	
	public void setSecondNumber(S secondNumber) 
	{
		this.secondNumber = secondNumber;
	}
	
	public S getSecondNumber() 
	{
		return secondNumber;
	}
	
	public static <U extends Number , S extends Number> Number substract(U firstNumber , S secondNumber)
	{
		return firstNumber.doubleValue()  - secondNumber.doubleValue() ; 
	}
	
	public static void main(String[] args) 
	{
		SubtractionFunction<? extends Number , ? extends Number> number = new SubtractionFunction(8,5) ; 
		System.out.println(substract(number.getFirstNumber(), number.getSecondNumber()));

	}
	
}