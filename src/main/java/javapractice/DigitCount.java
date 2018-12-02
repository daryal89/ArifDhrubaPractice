package javapractice;

public class DigitCount {

	public static void main(String[] args) {

		counting(10);
		counting(122344);
		counting(123);
		counting(11111);
	}

	public static void counting(int b) {
		int a = b;
		int count = 0;
		while (a != 0) {
			count++;
			a = a / 10;
		}
		System.out.println("digitcount of :" + b + " is " + count);
	}

}
