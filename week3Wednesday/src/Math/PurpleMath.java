package Math;

import java.util.Arrays;
import java.util.Scanner;

public class PurpleMath implements Statistics {

	@Override
	public int getMean(int[] numbers) {

		int sum = 0;
		int avarage = 0;
		for (int i = 0; i < numbers.length; i++) {

			sum = sum + numbers[i];
			avarage = sum / numbers.length;
		}
		System.out.print("Mean:");
		return avarage;

	}

	@Override
	public int getMode(int[] numbers) {
		int count = 1, tempCount;
		int popular = numbers[0];
		int temp = 0;
		for (int i = 0; i < numbers.length - 1; i++) {
			temp = numbers[i];
			tempCount = 0;
			for (int j = 1; j < numbers.length; j++) {
				if (temp == numbers[j])
					tempCount++;
			}
			if (tempCount > count) {
				popular = temp;
				count = tempCount;
			}
		}
		System.out.print("Mode:");
		return popular;
	}

	@Override
	public int getRange(int[] numbers) {

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int result = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		result = max - min;
		System.out.print("Range:");
		return result;

	}

	@Override
	public int getMedian(int[] numbers) {
		int result = 0;
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length; i++) {
			result = (numbers.length + 1) / 2;
		}
		System.out.print("Median:");
		return result;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter odd number of numbers");
		int arrSize = sc.nextInt();
		int[] intArray = new int[arrSize];
		for (int i = 0; i < arrSize; i++) {
			System.out.println("Input " + i + " : ");
			intArray[i] = sc.nextInt();
		}

		PurpleMath zad1 = new PurpleMath();
		System.out.println(zad1.getRange(intArray));
		System.out.println(zad1.getMode(intArray));
		System.out.println(zad1.getMean(intArray));
		System.out.println(zad1.getMedian(intArray));

	}

}
