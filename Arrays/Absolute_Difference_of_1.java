package GeeksForGeeks;

import java.util.Scanner;

public class Absolute_Difference_of_1 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();

		for (int g = 0; g < t; g++) {

			int n = s.nextInt();
			int k = s.nextInt();

			int arr[] = new int[n];

			for (int i = 0; i < n; i++) {
				arr[i] = s.nextInt();
				if (arr[i] < k) {
					absOne(Integer.toString(arr[i]), k);
				}
			}

		}

	}

	private static void absOne(String str, int k) {

		if (str.length() == 1) {
			System.out.print(str + " ");
			return;
		}
		int count = 0;
		for (int i = 0; i < str.length() - 1; i++) {

			if (Math.abs(str.charAt(i) - str.charAt(i + 1)) == 1) {
				count++;
			}
		}
		if (count == str.length() - 1) {
			System.out.print(str + " ");
		}
	}
}
