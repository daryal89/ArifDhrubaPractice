
package javapractice;

public class StringManipulation {
	public static void main(String[] args) {

		subString("This is my first day in class");

	}

	public static void subString(String a) {
		// a = "pizza best in this town";
		a.substring(0, 10);
		a.substring(a.length() - 10);
		System.out.println("The substring is: " + a.substring(0, 10));
		System.out.println("The substring is: " + a.substring(a.length() - 10));
	}
}
