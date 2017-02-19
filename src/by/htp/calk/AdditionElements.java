package by.htp.calk;

public class AdditionElements {

	public static void main(String[] args) {

		int[] array = new int[10];
		array[0] = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
			System.out.print(array[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < array.length; i = i + 2) {
			int sum = array[i] + array[i + 1];
			System.out.print(sum + " ");
		}
	}
}
