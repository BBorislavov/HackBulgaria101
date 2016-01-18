package week3Monday;


public class TripleGenerics<U,S,I> 
{
	private U first ; 
	private S second ; 
	private I trird ; 
	
	public TripleGenerics(U _first, S _second , I _third)
	{
		this.first = _first  ;
		this.second = _second ; 
		this.trird = _third ; 
	}
	
	public TripleGenerics()
	{
		this.first = null ; 
		this.second = null ; 
		this.trird = null  ;
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
	
	public I getTrird() 
	{
		return trird;
	}
	
	public void setTrird(I trird)
	{
		this.trird = trird;
	}
	
	
	
public static void main(String[] args) 
	
	{
		TripleGenerics<? extends Number , ? extends Number , ? extends Number> third = new TripleGenerics(4,5,6) ; 
		System.out.println(third.getTrird());
		
	}
	
}


