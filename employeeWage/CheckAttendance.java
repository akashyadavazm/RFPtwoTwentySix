package day8Problems.employeeWage;

public class CheckAttendance {

	public static void TakeAttendance() {

		double empattendance = Math.floor(Math.random() * 10) % 2;
		if (empattendance == 1) {
			System.out.println("Employee is present");
		} else {
			System.out.println("Employee is absent");
		}
	}

	public static void main(String[] args) {
		TakeAttendance();
	}

}
