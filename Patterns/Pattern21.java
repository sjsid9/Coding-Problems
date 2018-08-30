package Patterns;
import java.util.Scanner;

public class Pattern21 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int nst = 1;
		int nsp = 2 * n - 3;

		for (int i = 1; i <= n; i++) {

			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("*");
			}

			if (i < n) {
				for (int csp = 1; csp <= nsp; csp++) {
					System.out.print(" ");
				}
			} else {
				System.out.print("*");
			}

			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("*");
			}

			System.out.println();
			if (i < n) {
				nsp = nsp - 2;
				nst = nst + 1;
			}
			if (i == n - 1) {
				nsp = 0;
				nst = n - 1;
			}
		}

	}
}