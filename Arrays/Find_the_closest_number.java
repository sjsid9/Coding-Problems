package GeeksForGeeks;

import java.util.Scanner;

public class Find_the_closest_number {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();

		for (int k = 0; k < t; k++) {
			int n = s.nextInt();
			int elm = s.nextInt();

			int arr[] = new int[n];

			int diff = 0;
			int min = Integer.MAX_VALUE;
			int idx = 0;
			for (int i = 0; i < n; i++) {
				arr[i] = s.nextInt();
				diff = Math.abs(arr[i] - elm);
				if (diff <= min) {
					min = diff;
					idx = i;
				}
			}

			System.out.println(arr[idx]);

		}
		System.out.println();
	}
}