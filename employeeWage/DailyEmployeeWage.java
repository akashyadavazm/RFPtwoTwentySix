package day8Problems.employeeWage;

public class DailyEmployeeWage {
	int empwage_hrs;

	public void DailyWage(int wage_per_hrs) {
		int AttndCheck = (int) Math.floor(Math.random() * 10) % 2;
		if (AttndCheck == 1) {
			empwage_hrs = 8;
		} else {
			empwage_hrs = 0;
		}

		int dailyempwage = empwage_hrs * wage_per_hrs;

		System.out.println("Dialy Employees Wages are : " + dailyempwage);

	}

	public void DailyWage() {
	}

	public static void main(String[] args) {
		DailyEmployeeWage wage = new DailyEmployeeWage();
		wage.DailyWage(20);

	}

}
