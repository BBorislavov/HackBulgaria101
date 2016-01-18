package week3Friday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student implements Comparable<Student> {
	private String name;
	private int grade;

	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getGrade() {
		return grade;
	}

	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public int compareTo(Student other) {

		if (this.grade == other.grade) {
			return this.name.compareTo(other.name);
		}
		return this.grade - other.grade;

	}

	public static void main(String[] args) {
		Student Ivan = new Student("Ivan", 5);
		Student Kiril = new Student("Kiril", 7);
		Student Pesho = new Student("Pesho", 23);
		Student Gosho = new Student("Gosho", 16);

		List<Student> students = new ArrayList<>();

		students.add(Ivan);
		students.add(Kiril);
		students.add(Pesho);
		students.add(Gosho);

		for (Student p : students)
	    System.out.println(p);
		
	}

}
