package day8Problems.employeeWage;

public class UsingSwitchCase {

	public void switchcase(int empwagehrs) {
		int emphrs;
		int empcheck = (int) Math.floor(Math.random() * 10) % 3;

		switch (empcheck) {
		case 1:
			emphrs = 10;
			break;
		case 2:
			emphrs = 8;
			break;
		default:
			emphrs = 0;
			break;
		}

		emphrs += emphrs;
		int empwage = empwagehrs * emphrs;
		System.out.println("Total Employee Wages : " + empwage);

	}

	public static void main(String[] args) {
		UsingSwitchCase ca = new UsingSwitchCase();
		ca.switchcase(20);
	}

}
