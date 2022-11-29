package day4Problems.snakesAndLadders;

public class SnakesAndLadders {

	public static void main(String[] args) {
		int playerAPosition = 0;
		int playerBPosition = 0;
		int count = 0;
		int x;

		while (playerAPosition != 100 && playerBPosition != 100) {
			System.out.println();
			x = 1 + (int) Math.floor(Math.random() * 10) % 6;
			if (playerAPosition + x <= 100) {
				playerAPosition = x + playerAPosition;
				System.out.println("PlayerA throws " + x);

			}
			System.out.println("PlayerA reaches at " + playerAPosition);

			switch (playerAPosition) {
//			For Ladders
			case 1:
				System.out.println("PlayerA reaches to top of the ladder");
				playerAPosition = 38;
				System.out.println("PlayerA climbs at 38");
				break;
			case 4:
				System.out.println("PlayerA reaches to top of the ladder");
				playerAPosition = 14;
				System.out.println("PlayerA climbs at 14");
				break;
			case 9:
				System.out.println("PlayerA reaches to top of the ladder");
				playerAPosition = 31;
				System.out.println("PlayerA climbs at 31");
				break;
			case 21:
				System.out.println("PlayerA reaches to top of the ladder");
				playerAPosition = 42;
				System.out.println("PlayerA climbs at 42");
				break;
			case 28:
				System.out.println("PlayerA reaches to top of the ladder");
				playerAPosition = 84;
				System.out.println("PlayerA climbs at 84");
				break;
			case 51:
				System.out.println("PlayerA reaches to top of the ladder");
				playerAPosition = 67;
				System.out.println("PlayerA climbs at 67");
				break;
			case 72:
				System.out.println("PlayerA reaches to top of the ladder");
				playerAPosition = 91;
				System.out.println("PlayerA climbs at 91");
				break;
			case 80:
				System.out.println("PlayerA reaches to top of the ladder");
				playerAPosition = 99;
				System.out.println("PlayerA climbs at 99");
				break;
//				For Snakes
			case 17:
				System.out.println("PlayerA reaches at mouth of the snake");
				playerAPosition = 7;
				System.out.println("PlayerA goes down at 7");
				break;
			case 54:
				System.out.println("PlayerA reaches at mouth of the snake");
				playerAPosition = 34;
				System.out.println("PlayerA goes down at 34");
				break;
			case 62:
				System.out.println("PlayerA reaches at mouth of the snake");
				playerAPosition = 19;
				System.out.println("PlayerA goes down at 19");
				break;
			case 64:
				System.out.println("PlayerA reaches at mouth of the snake");
				playerAPosition = 60;
				System.out.println("PlayerA goes down at 60");
				break;
			case 87:
				System.out.println("PlayerA reaches at mouth of the snake");
				playerAPosition = 36;
				System.out.println("PlayerA goes down at 36");
				break;
			case 93:
				System.out.println("PlayerA reaches at mouth of the snake");
				playerAPosition = 73;
				System.out.println("PlayerA goes down at 73");
				break;
			case 95:
				System.out.println("PlayerA reaches at mouth of the snake");
				playerAPosition = 75;
				System.out.println("PlayerA goes down at 75");
				break;
			case 98:
				System.out.println("PlayerA reaches at mouth of the snake");
				playerAPosition = 79;
				System.out.println("PlayerA goes down at 79");
				break;
			default:
				break;
			}
			System.out.println();

			x = 1 + (int) Math.floor(Math.random() * 10) % 6;
			if (playerBPosition + x <= 100) {
				playerBPosition = x + playerBPosition;
				System.out.println("PlayerB throws " + x);

			}
			System.out.println("PlayerA reaches at " + playerAPosition);
			switch (playerAPosition) {
//			For Ladders
			case 1:
				System.out.println("PlayerA reaches to top of the ladder");
				playerAPosition = 38;
				System.out.println("PlayerA climbs at 38");
				break;
			case 4:
				System.out.println("PlayerA reaches to top of the ladder");
				playerAPosition = 14;
				System.out.println("PlayerA climbs at 14");
				break;
			case 9:
				System.out.println("PlayerA reaches to top of the ladder");
				playerAPosition = 31;
				System.out.println("PlayerA climbs at 31");
				break;
			case 21:
				System.out.println("PlayerA reaches to top of the ladder");
				playerAPosition = 42;
				System.out.println("PlayerA climbs at 42");
				break;
			case 28:
				System.out.println("PlayerA reaches to top of the ladder");
				playerAPosition = 84;
				System.out.println("PlayerA climbs at 84");
				break;
			case 51:
				System.out.println("PlayerA reaches to top of the ladder");
				playerAPosition = 67;
				System.out.println("PlayerA climbs at 67");
				break;
			case 72:
				System.out.println("PlayerA reaches to top of the ladder");
				playerAPosition = 91;
				System.out.println("PlayerA climbs at 91");
				break;
			case 80:
				System.out.println("PlayerA reaches to top of the ladder");
				playerAPosition = 99;
				System.out.println("PlayerA climbs at 99");
				break;
//				For Snakes
			case 17:
				System.out.println("PlayerA reaches at mouth of the snake");
				playerAPosition = 7;
				System.out.println("PlayerA goes down at 7");
				break;
			case 54:
				System.out.println("PlayerA reaches at mouth of the snake");
				playerAPosition = 34;
				System.out.println("PlayerA goes down at 34");
				break;
			case 62:
				System.out.println("PlayerA reaches at mouth of the snake");
				playerAPosition = 19;
				System.out.println("PlayerA goes down at 19");
				break;
			case 64:
				System.out.println("PlayerA reaches at mouth of the snake");
				playerAPosition = 60;
				System.out.println("PlayerA goes down at 60");
				break;
			case 87:
				System.out.println("PlayerA reaches at mouth of the snake");
				playerAPosition = 36;
				System.out.println("PlayerA goes down at 36");
				break;
			case 93:
				System.out.println("PlayerA reaches at mouth of the snake");
				playerAPosition = 73;
				System.out.println("PlayerA goes down at 73");
				break;
			case 95:
				System.out.println("PlayerA reaches at mouth of the snake");
				playerAPosition = 75;
				System.out.println("PlayerA goes down at 75");
				break;
			case 98:
				System.out.println("PlayerA reaches at mouth of the snake");
				playerAPosition = 79;
				System.out.println("PlayerA goes down at 79");
				break;
			default:
				break;
			}
			count++;
		}
		System.out.println(+count);
		if (playerAPosition >= 100 & playerBPosition >= 100) {
			System.out.println("It's a tie game");

		} else if (playerAPosition >= 100) {
			System.out.println("PlayerA is winner");
		} else {
			System.out.println("PlayerB is winner");
		}

	}

}
