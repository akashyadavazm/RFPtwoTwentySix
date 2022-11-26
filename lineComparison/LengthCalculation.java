package day8Problems.lineComparison;

public class LengthCalculation {
	
	int x1; int y1;
	int x2; int y2;
	public void calculate(int x1, int y1, int x2, int y2) {
		int length;
		length = (int) Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
		System.out.println("Length : " +length);

	}
public static void main(String[] args) {
	LengthCalculation len = new LengthCalculation();
	len.calculate(10, 14, 20, 19);
}

}
