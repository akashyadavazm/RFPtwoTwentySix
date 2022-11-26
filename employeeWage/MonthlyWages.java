package day8Problems.employeeWage;

public class MonthlyWages {
	
	public void MonthlyWage(int wageperhrs, int workingdays) {
		int emphrs;
		int totalempwage=0;int empwage=0;
		for(int day=0;day<workingdays;day++) {
		int empcheck = (int) Math.floor(Math.random()*10)%3;
	
		switch (empcheck) {
		case 1:
			emphrs=10;
			break;
		case 2:
			emphrs=8;
			break;
		default:
			emphrs=0;
		}
		empwage = emphrs * wageperhrs;
		totalempwage+=empwage;
		System.out.println( "Employee Wage: "+empwage);
	}
	System.out.println("Total Employee Wage : "+totalempwage);	

}
public static void main(String[] args) {
	MonthlyWages mnth = new MonthlyWages();
	mnth.MonthlyWage(20, 20);
	}

}
