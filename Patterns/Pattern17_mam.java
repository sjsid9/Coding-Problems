package Patterns;
import java.util.Scanner;

public class Pattern17_mam {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int nst = n / 2;
		int nsp = 1;

		for (int i = 1; i <= n; i++) {

			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("*");
			}

			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}

			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("*");
			}
			System.out.println();
			if (i <= n / 2) {
				nsp = nsp + 2;
				nst = nst - 1;
			} else {
				nsp = nsp - 2;
				nst = nst + 1;
			}
		}
	}
}
