package GeeksForGeeks;

import java.util.Scanner;

public class Reverse_an_array_in_groups_of_given_size {
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

			int ub = d - 1; // upper bound
			int lb = 0; // lower bound

			int quotient = n / d;
			int rem = n % d;

			for (int j = 0; j < quotient; j++) {

				for (int i = ub; i >= lb; i--) {
					System.out.println(arr[i]);
				}
				ub = ub + d;
				lb = lb + d;
			}

			if (rem > 0) {
				for (int i = arr.length - 1; i > arr.length - 1 - rem; i--) {
					System.out.print(arr[i]+" ");
				}
			}
			
			System.out.println();
			
		}

	}
}