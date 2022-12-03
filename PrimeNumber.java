package day6Problems.logicalPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void forPrimeNumber(int n) {

		int m = n / 2;
		boolean flag = false;
		for (int i = 2; i <= m; i++) {
			if (n % i == 0) {
				flag = true;

			}
		}
		if (flag == false) {
			System.out.println(n + " is a prime number");
		} else {
			System.out.println(n + " is not a prime number");
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		sc.close();
		forPrimeNumber(n);
	}

}
