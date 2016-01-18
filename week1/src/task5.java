import java.util.Scanner;
import java.util.Arrays;

public class task5 {

	static double getAverage(int[] arr) {
		int avarage = 0;
		for (int i = 0; i < arr.length; i++) {
			avarage += arr[i];
		}
		return (avarage / arr.length);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] array = new int[size];
		double avarage = 0;
		System.out.println("Enter elements in array");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println(getAverage(array));
	}

}
