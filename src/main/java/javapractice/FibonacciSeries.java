package javapractice;

public class FibonacciSeries {

	public static void main(String[] args) {

		fibonacci(5);
		fibonacci(10);
		fibonacci(15);
		fibonacci(40);
		
	}

	public static void fibonacci(int a) {
		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		System.out.print(num1 + " " + num2 + " ");
		for (int i = 2; i < a; i++) {
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			System.out.print(sum + " ");
		}
		System.out.println();
	}
}
