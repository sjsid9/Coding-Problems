package GeeksForGeeks;

import java.util.Scanner;

public class Find_the_fine {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();

		for (int k = 0; k < t; k++) {

			int n = s.nextInt();
			int date = s.nextInt();

			int car[] = new int[n];
			int penalty[] = new int[n];

			for (int i = 0; i < n; i++) {
				car[i] = s.nextInt();
			}

			for (int i = 0; i < n; i++) {
				penalty[i] = s.nextInt();
			}

			int pay = 0;

			for (int i = 0; i < n; i++) {

				if (date % 2 == 0) {

					if ((car[i] - date) % 2 != 0) {
						pay += penalty[i];
					}

				} else {
					if ((car[i] - date) % 2 != 0) {
						pay += penalty[i];
					}
				}

			}

			System.out.println(pay);
			
		}

	}
}