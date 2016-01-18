package pack2;

public class UserInputChecker 
{
	
	interface Validator
	{
		public boolean validate(String input) ; 
	}
	
	class PersonNameValidator implements Validator
	{

		@Override
		public boolean validate(String input) 
		{
			for(int i=0 ; i<input.length() ; i++)
			{
				char symbol = input.charAt(i) ;
				if(!(symbol == ' ' || (symbol >= 'a' && symbol <= 'z') || (symbol >= 'A' && symbol <= 'Z')))
				{
					throw new IllegalArgumentException("bla bla")  ;
				}
			}
			return true ;
		}
		
	}
	
	class BulgarianPhoneNumberValidator implements Validator
	{

		@Override
		public boolean validate(String input)
		{
			if(input.length()!=10)
			{
				return false ; 
			}
			if(input.charAt(0) != 0 || input.charAt(1) != 8 || input.charAt(2) <7) 
			{
				return false ; 
			}
			for(int i=3 ; i<10 ; i++)
			{
				if(input.charAt(i) < '0' || input.charAt(i) > '9')
				{
					return false ; 
				}
			}
			return true ;
		}
		
	}
	
	class PersonAgeValidator implements Validator
	{

		@Override
		public boolean validate(String input) 
		{
			if(input.charAt(0) == '0' || input.length() > 3) 
			{
				return false ; 
			}
			if(input.length() ==3 && input.charAt(0) != '1')
			{
				return false ; 
			}
			for(int i=0 ; i<input.length() ; i++)
			{
				if(input.charAt(i) < '0' || input.charAt(i) > '9')
				{
					return false ; 
				}
			}
			return true ; 
			
		}
		
	}
	
	class CreditCardNumberValidator implements Validator
	{

		@Override
		public boolean validate(String input) 
		{
			if(input.length()!=16)
			{
				throw new IllegalArgumentException("bla bla") ; 
			}

			int [] creditCardNumber = new int [16];
			for(int i=0 ; i<16 ; i++)
			{
				if(input.charAt(i)<'0' || input.charAt(i)>'9')
				{
					return false ; 
				}
				creditCardNumber[i] = input.charAt(i) - '0' ;
			}
			
			return false ;
		}
		
	}
	
	class IpVersion4Validator implements Validator 
	{

		@Override
		public boolean validate(String input)
		{
		
			return false;
		}
		
	}
	
	class IpVersion6Validator implements Validator
	{

		@Override
		public boolean validate(String input) 
		{
		
			return false;
		}
		
	}
	
	class MacAddressValidator implements Validator
	{

		@Override
		public boolean validate(String input) 
		{
			
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		
	}

}
