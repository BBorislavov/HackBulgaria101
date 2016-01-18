package week3Monday;

public class MultiplicationFunction<U extends Number , S extends Number>
{
	private U firstNumber ; 
	private S secondNumber ;
	
	
	
	public MultiplicationFunction(U firstNumberInput , S secondNumberInput)
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
	
	public static <U extends Number , S extends Number> Number multiplication(U firstNumber , S secondNumber)
	{
		return firstNumber.doubleValue() * secondNumber.doubleValue() ; 
	}
	
	public static void main(String[] args) 
	{
		MultiplicationFunction<? extends Number , ? extends Number> number = new MultiplicationFunction(8,5) ; 
		System.out.println(multiplication(number.getFirstNumber(), number.getSecondNumber()));

	}
	
}