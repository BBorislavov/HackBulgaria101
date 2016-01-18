package geometryFigures;

public final class Point {
	private final int x;
	private final int y;

	public Point() {
		this(0, 0);
	}

	public Point(Point p) {
		this(p.x, p.y);
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Point origin() {
		return new Point();
	}

	@Override
	public String toString() {
		return String.format("Point(%d , %d)", this.x, this.y);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (this.getClass().equals(obj.getClass())) {
			return false;
		}

		Point temp = (Point) obj;
		return this.getX() == temp.getX() && this.getY() == temp.getY();
	}

	@Override
	public int hashCode() {
		Integer newX = x;
		Integer newY = y;
		int hash = 17;
		hash = hash * 23 + newX.hashCode();
		hash = hash * 23 + newY.hashCode();
		return hash;
	}
	
	public static LineSegment Add(Point point1, Point point2)
	{
		return new LineSegment(point1 , point2) ;
	} 
	
	public static void main(String[] args) {
		Point first = new Point(3,3) ; 
		System.out.println(first.toString());
	}

}
