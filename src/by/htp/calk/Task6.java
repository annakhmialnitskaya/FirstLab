package by.htp.calk;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1_3 = sc.next();

		System.out.println(isWordSymbolCodesInAsc(s1_3));
	}

	public static boolean isWordSymbolCodesInAsc(String word) {
		char[] wordChars = word.toCharArray();
		boolean result = true;
		for (int i = 0; i < wordChars.length - 1; i++) {
			if (((int) wordChars[i + 1] - (int) wordChars[i]) != 1) {
				result = false;
				break;
			}
		}
		return result;
	}
}
