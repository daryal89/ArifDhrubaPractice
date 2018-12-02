package javapractice;

public class ReverseNumberDemo {

	public static void main(String[] args) {
		reverseNum(12);
		reverseNum(12345);
		reverseNum(12345678);

	}

	public static void reverseNum(int a) {
		int num = a;
		int reverse = 0;
		while (num != 0) {
			reverse = reverse * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("The reverse of " + a + " is : " + reverse);
	}

}
