package week3Monday;

import sun.security.action.GetBooleanAction;

class BackPack<F>
{
	private F obj ;
	
	public BackPack(F obj)
	{
		this.obj = obj ;
	}
	
	public F getObj() 
	{
		return obj;
	}
	
	public void setObj(F obj) 
	{
		this.obj = obj;
	}
	
}




public class GenericBackPack
{

	public static void main(String[] args)
	{
		BackPack<String> backpack = new BackPack<>("backpack1") ; 
		System.out.println();
		backpack.setObj("new backpack");
		
	}

}
