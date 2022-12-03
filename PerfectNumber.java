package day6Problems.logicalPrograms;

import java.util.Scanner;

public class PerfectNumber {

	public static void MethodForPerfect(long n) {
		long add = 0;
		int i = 1;

		while (i <= n / 2) {

			if (n % i == 0) {
				add = add + i;

			}
			i++;

		}
		if (add == n)

		{
			System.out.println(+n + " is a perfect number");
		} else {
			System.out.println(n + " is not a perfect number");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		long n = sc.nextLong();
		sc.close();
		MethodForPerfect(n);
	}

}
