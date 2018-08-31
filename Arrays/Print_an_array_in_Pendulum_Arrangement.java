package GeeksForGeeks;

import java.util.Arrays;
import java.util.Scanner;

public class Print_an_array_in_Pendulum_Arrangement {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();

		for (int k = 0; k < t; k++) {
			int n = s.nextInt();
			int arr[] = new int[n];

			for (int i = 0; i < n; i++) {
				arr[i] = s.nextInt();
			}

			Arrays.sort(arr);

			int newar[] = new int[n];

			int mid;

			if (n % 2 == 0) {
				mid = (n - 1) / 2;
			} else {
				mid = n / 2;
			}

			int count = 1;
			int c = 0;
			newar[mid] = arr[0];
			for (int i = 1; i < n; i++) {

				if (i % 2 == 0) {
					newar[mid - count] = arr[i];
					c++;
				} else {
					newar[mid + count] = arr[i];
					c++;
				}
				if (c % 2 == 0) {
					count++;
				}
			}

			for (int val : newar) {
				System.out.print(val+" ");
			}
			System.out.println();
		}

	}
}
