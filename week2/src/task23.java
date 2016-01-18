class Car
	{
		public boolean isEcoFriendly(boolean testing)
		{
			return true ; 
		}
	}
	
	
	class Volkswagen extends Car
	{
		public boolean isEcoFriendly(boolean testing)
		{
			if(testing)
			{
				return true ;
			}
			else 
			{
				return false ;
			}
		}
	}
	
	class BMW extends Car
	{
		
	}
	
	class Honda extends Car
	{
		
	}
	
	class Shkoda extends Car
	{
		
	}
	
	class Audi extends Car
	{
		private int mileage ; 
		public Audi(int mil)
		{
			mileage = mil  ;
		}
		
		public int getMileage()
		{
			return mileage ;
		}
		
	}
	

public class task23
{
	public static void main(String[] args) 
	{
		Audi audi1 = new Audi(10000) ; 
		System.out.println(audi1.getMileage());

	}

}
