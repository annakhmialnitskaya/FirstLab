package by.htp.calk;

public class Array2 {

	private int[] array = { 1, 3, 4, 5, 7, 8, 9, 2 };

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] arr) {
		this.array = arr;
	}

	public static void calculate(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i = i + 2) {
			sum = array[i] + array[i + 1];
			printSum(sum);
		}
	}

	public static void printSum(int x) {
		System.out.println(x);
	}
}
