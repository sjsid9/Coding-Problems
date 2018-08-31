package GeeksForGeeks;

import java.util.Scanner;

public class Cyclically_rotate_an_array_by_one {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();

		for (int k = 0; k < t; k++) {

			int n = s.nextInt();
			int arr[] = new int[n];

			for (int i = 0; i < n; i++) {
				arr[i] = s.nextInt();
			}

			for (int i = 0; i < n - 1; i++) {
				int temp = arr[i + 1];
				arr[i + 1] = arr[0];
				arr[0] = temp;
			}

			for (int val : arr) {
				System.out.print(val + " ");
			}

		}

	}
}
