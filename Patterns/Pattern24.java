package Patterns;
import java.util.Scanner;

public class Pattern24 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int nsp = n - 1;
		int nst = 1;
		int val = 1;
		for (int i = 0; i < n; i++) {

			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}

			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(val);
			}

			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}

			System.out.println();
			nsp = nsp - 1;
			nst = nst + 2;
			val++;
		}

	}

}
