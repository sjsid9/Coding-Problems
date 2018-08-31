package GeeksForGeeks;

import java.util.Scanner;

public class Rotating_an_Array {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();

		for (int k = 0; k < t; k++) {

			int n = s.nextInt();
			int arr[] = new int[n];

			for (int i = 0; i < n; i++) {
				arr[i] = s.nextInt();
			}

			int d = s.nextInt();

			int newar[] = new int[n];
			int n1 = n;
			for (int i = n - 1; i >= 0; i--) {

				if (i - d >= 0) {
					newar[i - d] = arr[i];
				} else {
					newar[n1 - 1] = arr[i];
					n1--;
				}
			}

			for (int val : newar) {
				System.out.print(val + " ");
			}

			System.out.println();

		}

		s.close();
	}
}
