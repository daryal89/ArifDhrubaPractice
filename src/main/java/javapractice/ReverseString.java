package javapractice;

public class ReverseString {

	public static void main(String[] args) {
		reverseString("arif");
		reverseString("dhruba");
		reverseString("moyana");

	}

	public static void reverseString(String a) {
		String reverse = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			reverse = reverse + a.charAt(i);
		}
		System.out.println("The reverse of " + a + " is " + reverse);
	}

}
