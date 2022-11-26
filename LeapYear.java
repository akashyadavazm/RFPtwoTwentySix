package day5Problems.basicCorePrograms;

import java.util.Scanner;

public class LeapYear {

	public static void checkDigit(int year) {
		int reverse = 0;
		int count = 0;

		while (year != 0) {
			int remainder = year % 10;
			reverse = reverse * 10 + remainder;
			year = year / 10;
			count++;
		}
		if (count == 4) {
			System.out.println("\nYear is a Four Digit Number");
		} else {
			System.out.println("\nYear is not a Four Digit Number");
		}

	}

	public static void checkLeapYear(int year) {
		Boolean leap = false;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					leap = true;
				} else {
					leap = false;
				}
			} else {
				leap = false;
			}
		}
		if (leap) {
			System.out.println("\nYear is a leap year.");
		} else {
			System.out.println("\nYear is not a leap year.");
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Year");
		int year = s.nextInt();
		s.close();
		checkDigit(year);
		checkLeapYear(year);

	}

}
