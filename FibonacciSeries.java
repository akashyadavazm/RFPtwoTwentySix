package day6Problems.logicalPrograms;

import java.util.Scanner;

public class FibonacciSeries {

	static void ConsecutiveAddition(int count) {
		int n1 = 0, n2 = 1;
		for (int i = 2; i <= count; i++) {
			int value = n1 + n2;
			n1 = n2;
			n2 = value;
			System.out.println(value);

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to get Series : ");
		int count = sc.nextInt();
		ConsecutiveAddition(count);
		sc.close();
	}

}
