package day6Problems.logicalPrograms;

import java.util.Scanner;

public class ReverseANumber {

	public static void RevNum(int n) {
		int rev = 0;
		while (n != 0) {

			int digit = n % 10;
			rev = rev * 10 + digit;
			n = n / 10;

		}
		System.out.println("Reverse digit is : " + rev);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for Reversing : ");
		int n = sc.nextInt();
		sc.close();
		RevNum(n);
	}

}
