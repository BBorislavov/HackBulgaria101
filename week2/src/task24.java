

public class task24 
{
	
	private int day;
	private int monts;
	private int years;
	
	private int hours;
	private int minutes;

	public task24(int d, int m, int y, int h, int min)
	{
		this.day = d;
		this.monts = m;
		this.years = y;
		
		this.hours = h;
		this.minutes = m;
	}
	
	
	
	
	@Override
	public String toString(){
		return String.format("%d:%d:%d %d.%d.%d", hours, minutes, years, day, monts, years);
	}
	
	public static void main(String[] args) {
		task24 t = new task24(8, 2, 1995, 3, 55);
		
		System.out.println(t);
	}
}
