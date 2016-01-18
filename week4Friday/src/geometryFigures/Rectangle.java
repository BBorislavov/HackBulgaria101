package geometryFigures;

public final class Rectangle {

	private Point upLeft;
	private Point lowRight;
	private Point lowLeft;
	private Point upRigh;

	private LineSegment up;
	private LineSegment down;
	private LineSegment right;
	private LineSegment left;

	private double width;
	private double height;

	private double perimeter;
	private double area;

	public Rectangle(Point point1, Point point2) {
		if (point1.getX() == point2.getX() || point1.getY() == point2.getY()) {
			throw new IllegalArgumentException();
		} else {
			this.upLeft = point1;
			this.lowRight = point2;
			this.lowLeft = new Point(upLeft.getY(), lowRight.getX());
			this.upRigh = new Point(upLeft.getX(), lowRight.getY());

			this.up = new LineSegment(upLeft, upRigh);
			this.down = new LineSegment(lowLeft, lowRight);
			this.right = new LineSegment(lowRight, upRigh);
			this.left = new LineSegment(lowLeft, upLeft);

			this.height = left.getLength();
			this.width = down.getLength();

			this.perimeter = left.getLength() + right.getLength() + down.getLength() + up.getLength();
			this.area = left.getLength() * down.getLength();

		}
	}

	public Rectangle(Rectangle other) {
		this.upLeft = other.upLeft;
		this.lowRight = other.lowRight;
		this.lowLeft = other.lowLeft;
		this.upRigh = other.upRigh;
	}

	public LineSegment getDown() {
		return down;
	}

	public LineSegment getLeft() {
		return left;
	}

	public LineSegment getRigh() {
		return right;
	}

	public LineSegment getUp() {
		return up;
	}

	public Point getLowLeft() {
		return lowLeft;
	}

	public Point getLowRigh() {
		return lowRight;
	}

	public Point getUpLeft() {
		return upLeft;
	}

	public Point getUpRigh() {
		return upRigh;
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	public double getPerimeter() {
		return perimeter;
	}

	public double getArea() {
		return area;
	}

	@Override
	public String toString() {
		String result = "x , y [(" + down.getLength() + "," + left.getLength() + ")]";
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (this.getClass().equals(obj.getClass())) {
			return false;
		}

		Rectangle temp = (Rectangle) obj;
		return this.getLeft() == temp.getLeft() && this.getUp() == temp.getUp();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + lowRight.hashCode();
		result = prime * result + upLeft.hashCode();
		return result;
	}

}
