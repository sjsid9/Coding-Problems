package Patterns;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int st = n;

		for (int i = 1; i <= n; i++) {

			System.out.print("*");

			if (i == 1 || i == n) {
				for (int j = 1; j <= n - 2; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 1; j <= n - 2; j++) {
					System.out.print(" ");
				}
			}
			System.out.print("*");
			System.out.println();
		}

	}
}
