package Patterns;
import java.util.Scanner;

public class Pattern18_Mam {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int nst = 1;
		int nsp = n / 2;

		for (int i = 1; i <= n; i++) {

			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}

			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("*");
			}

			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}

			System.out.println();
			if (i <= n / 2) {
				nsp = nsp - 1;
				nst = nst + 2;
			} else {
				nsp = nsp + 1;
				nst = nst - 2;
			}
		}

	}
}
