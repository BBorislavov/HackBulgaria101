package week3Monday;

public class PowerFunction<U extends Number , S extends Number>
{
	private U firstNumber ; 
	private S secondNumber ;
	
	
	
	public PowerFunction(U firstNumberInput , S secondNumberInput)
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
	
	public static <U extends Number , S extends Number> Number p(U firstNumber , S secondNumber)
	{
		return Math.pow(firstNumber.doubleValue(), secondNumber.doubleValue()) ; 
	}
	
	public static void main(String[] args) 
	{
		PowerFunction<? extends Number , ? extends Number> number = new PowerFunction(2,3) ; 
		System.out.println(p(number.getFirstNumber(), number.getSecondNumber()));

	}
	
}