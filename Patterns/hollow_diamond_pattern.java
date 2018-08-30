package Patterns;

import java.util.Scanner;

public class hollow_diamond_pattern {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int nst = (n - 1) / 2;
		int nsp;
		if (n % 2 == 0) {
			 nsp = 2;
		}else {
			 nsp=1;
		}

		for (int i = 0; i < n; i++) {

			if (i == 0 || i == n - 1) {
				for (int j = 0; j < n; j++) {
					System.out.print("*\t");
				}
			} else {

				for (int cst = 0; cst < nst; cst++) {
					System.out.print("*\t");
				}

				for (int csp = 0; csp < nsp; csp++) {
					System.out.print("\t");
				}

				for (int cst = 0; cst < nst; cst++) {
					System.out.print("*\t");
				}

			}

			if (i != 0 && i < (n + 1) / 2 - 1) {
				nst--;
				nsp++;
				nsp++;
			} else if (i != n - 1 && i >= (n + 1) / 2 - 1) {
				nst++;
				nsp--;
				nsp--;
			}

			System.out.println();

		}

	}

}
