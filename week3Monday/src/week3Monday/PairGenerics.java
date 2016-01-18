package week3Monday;


public class PairGenerics<U , S>
{
	private U first ; 
	private S second ; 
	
	public PairGenerics(U  _first, S  _second)
	{
		this.first = _first  ;
		this.second = _second ; 
	}
	
	public PairGenerics()
	{
		this.first = null ; 
		this.second = null ; 
	}
	
	public void setFirst(U first)
	{
		this.first = first;
	}
	
	public U getFirst()
	{
		return first;
	}
	
	public S getSecond() 
	{
		return second;
	}
	
	public void setSecond(S second)
	{
		this.second = second;
	}
	
	public static void main(String[] args) 
	{
		PairGenerics<? extends Number , ? extends Number> first = new PairGenerics(4,5) ; 
		System.out.println(first.getFirst());
	}

	
}


	