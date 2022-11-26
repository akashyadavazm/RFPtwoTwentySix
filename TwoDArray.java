package day5Problems.functionalPrograms;

import java.util.Scanner;

public class TwoDArray {
	public static void library() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two Dimensional Array size");
		int row = s.nextInt();
		int column = s.nextInt();
		s.close();

		System.out.println("Enter Array Elements : ");
		int[][] arr = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		 System.out.print("\nData you entered : \n");
	        for(int []x:arr){
	            for(int y:x){
	            System.out.print(y+"        ");
	            }
	            System.out.println();
	        }

	}

	public static void main(String[] args) {
		library();

	}

}
