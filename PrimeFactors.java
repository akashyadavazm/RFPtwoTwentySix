package day5Problems.basicCorePrograms;

import java.util.Scanner;

public class PrimeFactors {

	public static void primeFactors(int n) {

		while (n % 2 == 0) {
			System.out.println(2 + " ");
			n = n / 2;

		}
		for (int i = 3; i <= Math.sqrt(n); i++) {
			while (n % i == 0) {
				System.out.println(i + " ");
				n = n / i;

			}

		}
		if (n > 2) {
			System.out.println(n);

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n = sc.nextInt();
		System.out.println("Prime Factors of " + n + " are");
		primeFactors(n);

	}

}
