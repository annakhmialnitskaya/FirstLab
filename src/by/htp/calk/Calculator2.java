package by.htp.calk;

public class Calculator2 {

	public static void main(String[] args) {
		int x=10;
		int y=2;
		System.out.println(Calculator2.addition(x, y));
		System.out.println(Calculator2.subtraction(x, y));
		System.out.println(Calculator2.multiplication(x, y));
		System.out.println(Calculator2.division(x, y));


	}

	public static int addition(int x, int y) {

		return x + y;
	}

	public static int subtraction(int x, int y) {
		return x - y;
	}

	public static int multiplication(int x, int y) {
		return x * y;
	}

	public static int division(int x, int y) {
		return x / y;

	}
}
