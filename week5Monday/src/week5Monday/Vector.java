package week5Monday;

import java.awt.List;
import java.util.ArrayList;

public class Vector {

	ArrayList<Double> _vector = new ArrayList<>();

	public Vector(ArrayList<Double> input) {
		this._vector.addAll(input);

	}

	public Vector(Vector other) {
		this._vector.addAll(other._vector);
	}

	public void getCordinates() {
		for (double cordinates : _vector) {
			System.out.println("Vector : ");
			System.out.println(cordinates);
		}

	}

	public void setCordinates(int dim, double cordinates) {
		_vector.add(dim, cordinates);
	}

	public int getDimention() {
		return _vector.size();
	}

	public double getLenth() {
		double sum = 0;
		for (double el : _vector) {
			sum = sum + Math.pow(el, 2);
		}
		return Math.sqrt(sum);
	}

	@Override
	public String toString() {
		StringBuilder res = new StringBuilder();
		res.append("Vector {");
		for (double el : _vector) {
			res.append(el);
			res.append(" , ");

		}

		res.append("}");

		return res.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!this.getClass().equals(obj.getClass())) {
			return false;
		}
		Vector temp = (Vector) obj;

		return this.equals(temp);

	}

	@Override
	public int hashCode() {
		return _vector.hashCode();
	}

	public Vector add(Vector vector) {
		if (this._vector.size() != vector._vector.size()) {
			System.out.println("Vector cannot be added");
			return null;
		}

		ArrayList<Double> temp = new ArrayList<>();
		for (int i = 0; i < this._vector.size(); i++) {
			double sum = this._vector.get(i) + vector._vector.get(i);
			temp.add(i, sum);
		}
		Vector result = new Vector(temp);
		return result;

	}

	public Vector substract(Vector vector) {
		if (this._vector.size() != vector._vector.size()) {
			System.out.println("Operation cannot be donel different dimention");
			return null;
		}

		ArrayList<Double> temp = new ArrayList<>();
		for (int i = 0; i < this._vector.size(); i++) {
			double substr = this._vector.get(i) - vector._vector.get(i);
			temp.add(i, substr);
		}
		Vector result = new Vector(temp);
		return result;

	}

	public Vector add(Float by) {
		if (by == 0) {
			throw new IllegalArgumentException();
		}
		ArrayList<Double> temp = new ArrayList<>();
		for (int i = 0; i < this._vector.size(); i++) {
			double sum = this._vector.get(i) / by;
			temp.add(i, sum);
		}

		Vector result = new Vector(temp);
		return result;
	}

	public double DoProtect(Vector vector) {
		if (!this._vector.equals(vector._vector)) {
			throw new IllegalArgumentException("Different dimention");
		}
		ArrayList<Double> temp = new ArrayList<>();
		double res = 0;
		for (int i = 0; i < this._vector.size(); i++) {
			res = res + this._vector.get(i) * vector._vector.get(i);
		}
		return res;

	}

	public static void main(String[] args) {
		ArrayList<Double> firstCordinates = new ArrayList<>();
		firstCordinates.add(1.0);
		firstCordinates.add(2.0);
		firstCordinates.add(3.0);
		firstCordinates.add(4.0);
		Vector first = new Vector(firstCordinates);
		ArrayList<Double> secondCordinates = new ArrayList<>();
		secondCordinates.add(2.0);
		secondCordinates.add(3.0);
		secondCordinates.add(4.0);
		secondCordinates.add(5.0);

		Vector second = new Vector(secondCordinates);
		System.out.println(first.add(second));

	}

}

