package Patterns;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int ss = 0; // Starting spaces
		int st = n; // Stars
		int es = n - 1; // Ending Spaces

		for (int i = 1; i <= n; i++) {

			for (int css = 1; css <= ss; css++) {
				System.out.print(" ");
			}

			for (int cst = 1; cst <= st; cst++) {
				System.out.print("*");
			}

			for (int ces = 1; ces <= es; ces++) {
				System.out.print(" ");
			}

			System.out.println();
			ss += 2;
			st -= 1;
			es -= 1;
		}

	}

}
