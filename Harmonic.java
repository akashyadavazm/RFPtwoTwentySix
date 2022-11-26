package day5Problems.basicCorePrograms;

import java.util.Scanner;

public class Harmonic {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of Harmonic : ");
		double N = sc.nextInt();
		sc.close();

		double num = 0;

		for (double i = 1; i <= N; i++) {

			double Har = 1 / i;
			num = num + Har;

		}
		System.out.println(num);
	}

}
