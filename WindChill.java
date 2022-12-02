package day5Problems.functionalPrograms;

public class WindChill {
	
	 public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
		System.out.println("Give the value of Temprature ranges \n(T<=50) ");
		String t1 = sc.next();
		System.out.println("Give the value of WindSpeed ranges \n(3<V<120)");
		String v1 = sc.next();
		double t = Double.parseDouble(t1);
		double v = Double.parseDouble(v1);
		double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
		System.out.println("Temperature = " + t);
		System.out.println("Wind speed  = " + v);
		System.out.println("Wind chill  = " + w);
	    }

}
