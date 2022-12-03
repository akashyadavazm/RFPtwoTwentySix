package day6Problems.logicalPrograms;

import java.util.Scanner;

public class StopWatch {

	public long startWatch = 0;
	public long stopWatch = 0;
	public long elapsed;

	public void Start() {

		startWatch = System.currentTimeMillis();
		System.out.println("Start Time is: " + startWatch);

	}

	public void Stop() {
		stopWatch = System.currentTimeMillis();
		System.out.println("Stop Time is: " + stopWatch);

	}

	public long getElapsedTime() {

		elapsed = stopWatch - startWatch;
		return elapsed;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StopWatch sw = new StopWatch();

		System.out.println("Press 1 to start time : ");
		sc.nextInt();
		sw.Start();

		System.out.println();

		System.out.println("Press 2 to stop time : ");
		sc.nextInt();
		sw.Stop();

		sc.close();

		double l = sw.getElapsedTime()/1000;
		System.out.println();
		System.out.println("Total time elapsed is : " + l + " Second");
	}

}
