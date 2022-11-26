package day8Problems.employeeWage;

public class TotalHours {

	public void TotalWage(int wageperhrs, int totalworkinghrs, int totalworkingdays) {
		int totalhrs = 0;
		int workingdays = 0;
		int emphrs = 0;
		int TotalEmpWage = 0;
		while (totalhrs <= totalworkinghrs && workingdays <= totalworkingdays) {
			workingdays++;
			int empcheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empcheck) {
			case 1:
				emphrs = 10;
				break;
			case 2:
				emphrs = 8;
			default:
				emphrs = 0;
				break;
			}
			totalhrs += emphrs;
			System.out.println("Days: " + totalworkingdays + " Total Working Hours : " + totalhrs);
		}
		TotalEmpWage = totalhrs * wageperhrs;
		System.out.println("Total employee Wages : " + TotalEmpWage);
	}

	public static void main(String[] args) {
		TotalHours total = new TotalHours();
		total.TotalWage(20, 100, 20);
	}

}
