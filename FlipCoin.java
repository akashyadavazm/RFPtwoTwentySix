package day5Problems.basicCorePrograms;

public class FlipCoin {

	public static void main(String[] args) {
		int numOfTimes = (int) Math.floor(Math.random() * 10);
		System.out.println("Number of times Coin Flipped : " + numOfTimes);
		float countH = 0, countT = 0;
		for (int i = 1; i <= numOfTimes; i++) {
			int flipResult = (int) Math.floor(Math.random() * 10) % 2;
			char possibility;
			if (flipResult == 1) {
				possibility = 'H';
				System.out.println("It's Heads : " + possibility + " " + flipResult);
				countH++;
			} else {
				possibility = 'T';
				System.out.println("It's Tails : " + possibility + " " + flipResult);
				countT++;
			}
		}
		System.out.println("\nNumber of Times Heads Comes : " + countH);
		System.out.println("Number of Times Tails Comes : " + countT);
		System.out.println("\nFor the Percentage of Head vs Tails");
		float percentage = (countH / countT) * 100;
		System.out.println(percentage);
	}

}
