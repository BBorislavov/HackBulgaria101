package geometryFigures;

public final class LineSegment {
	private Point start;
	private Point end;

	public LineSegment(Point start, Point end) {
		if (start.equals(end)) {
			throw new IllegalArgumentException();
		} else {
			this.start = start;
			this.end = end;
		}
	}

	public LineSegment(LineSegment p) {
		this(p.start, p.end);
	}

	public Point getEnd() {
		return end;
	}

	public Point getStart() {
		return start;
	}

	public int getLength() {
		double length = Math.sqrt(Math.pow(end.getX() - start.getX(), 2)) + Math.pow(end.getY() - start.getY(), 2);
		return (int) length;
	}

	@Override
	public String toString() {
		String result = "Line[(" + start.getX() + "," + start.getY() + "),(" + end.getX() + "," + end.getY() + ")]";
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

		LineSegment temp = (LineSegment) obj;
		return this.getStart() == temp.getStart() && this.getEnd() == temp.getEnd();
	}

	public int hashCode() {
		int hash = 17;
		hash = hash * 23 + start.hashCode();
		hash = hash * 23 + end.hashCode();
		return hash;
	}

}
