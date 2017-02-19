package by.htp.calk;

public class Main {

	public static void main(String[] args) {

		int x = 12;
		int y = 6;
		Calculator a = new Calculator();

		System.out.println(a.addition(x, y));
		System.out.println(a.subtraction(x, y));
		System.out.println(a.multiplication(x, y));
		System.out.println(a.division(x, y));

	}

}
