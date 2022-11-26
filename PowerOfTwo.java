package day5Problems.basicCorePrograms;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to get it's Power");
		int Pow = sc.nextInt();

		System.out.println("Enter the Power : ");
		int N = sc.nextInt();
		sc.close();

		long Power = 1;
		for (int i = 1; i <= N; i++) {

			Power = Power * Pow;

		}
		System.out.println();
		System.out.println(Power);

		PowerOfTwo two = new PowerOfTwo();
		two.Year(Power);

	}

	private void Year(long Power) {

		boolean leap = false;
		if (Power % 4 == 0) {
			if (Power % 100 == 0) {
				if (Power % 400 == 0) {
					leap = true;
				} else {
					leap = false;
				}
				leap = false;
			}
			if (leap)
				System.out.println(Power + " is a leap year");
			else
				System.out.println(Power + " is not a leap year");
		}
	}

}