package GeeksForGeeks;

import java.util.Scanner;

public class Leaders_in_an_array {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();

		for (int k = 0; k < t; k++) {

			int n = s.nextInt();
			int arr[] = new int[n];

			for (int i = 0; i < n; i++) {
				arr[i] = s.nextInt();
			}

			int count = 0;

			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {

					if (arr[i] >= arr[j]) {
						count++;
					} else {
						break;
					}
				}

				if (count == arr.length - 1 - i) {
					System.out.print(arr[i] + " ");
				}
				count = 0;
			}
			System.out.println();
		}

	}
}
