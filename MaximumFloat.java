package day13Problems.Generics;

public class MaximumFloat {

	public static <F extends Comparable<F>> F maximum(F g, F h, F i) {

		F max = g;
		if (h.compareTo(max) > 0) {
			max = h;
			if (i.compareTo(max) > 0) {
				max = i;
			}
		}
		return max;

	}

	public static void main(String[] args) {
		System.out.println("Maximum String is  " + maximum(78.462, 21.437, 37.445));

	}

}
