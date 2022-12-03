package day6Problems.logicalPrograms;

public class CouponNumber {

	public static void main(String[] args) {

		StringBuffer couponCode = new StringBuffer();

		char[] ch = "abefijmnokjklghcdAKNHKJBS".toCharArray();
		int max = ch.length - 1;
		char[] sb = new char[ch.length];
		int rand = (int) Math.floor(Math.random() * max);
		sb[0] = ch[rand];
		for (int i = 1; i < ch.length; i++) {
			rand = (int) Math.floor(Math.random() * 100) % max;
			for (int k = 0; k < i; k++) {
				if (sb[k] != ch[rand]) {
					sb[i] = ch[rand];

				}

			}

		}
		couponCode.append(sb);
		System.out.println(couponCode);

	}

}
