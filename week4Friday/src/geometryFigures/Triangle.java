package geometryFigures;

public final class Triangle 
{
	private Point leftA ; 
	private Point rightB ; 
	private Point upC ; 
	
	private LineSegment down ; 
	private LineSegment left ; 
	private LineSegment right; 
	
	
	private double perimeter;
	private double area ; 
	private double height ; 
	
	
	
	
	
	public Triangle(Point point1 , Point point2 , Point point3)
	{
		if(point1.getX() == point2.getX() || point1.getY() == point2.getY())
		{
			throw new IllegalArgumentException() ;
		}
		else 
		{
			this.leftA = point1 ; 
			this.rightB = point2 ; 
			this.upC = point3 ; 
			this.down = new LineSegment(leftA , rightB ) ; 
			this.left = new LineSegment(leftA , upC) ; 
			this.right = new LineSegment(rightB , upC) ; 
			this.perimeter = (down.getLength() + left.getLength() + right.getLength()) /2 ; 
			
		
		
			
		}
	}
	
	public Triangle(Triangle other) 
	{
		this.leftA = other.leftA ; 
		this.rightB = other.rightB ; 
		this.upC = other.upC ; 
	}
	
	public Point getLeftA() 
	{
		return leftA;
	}
	
	public Point getRightB() 
	{
		return rightB;
	}
	
	public Point getUpC()
	{
		return upC;
	}
	
	public LineSegment getDown() 
	{
		return down;
	}
	
	public LineSegment getRight()
	{
		return right;
	}
	
	public LineSegment getLeft() 
	{
		return left;
	}
	
	public double getHeight() 
	{
		return height;
	}
	
	public double getArea() 
	{
		return area;
	}
	
	public double getPerimeter() 
	{
		return perimeter;
	}
	
	@Override
	public String toString()
	{
		String result = "x , y [(" + height + "," + down.getLength() +")]" ;
		return result ; 
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		if (obj == null) 
		{
			return false;
		}
		if (this.getClass().equals(obj.getClass())) 
		{
			return false;
		}

		Triangle temp = (Triangle) obj;
		return this.getLeft() == temp.getLeft() && this.getUpC() == temp.getUpC();
	}
	
	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + leftA.hashCode();
		result = prime * result + rightB.hashCode();
		return result;
	}
	
	
}
