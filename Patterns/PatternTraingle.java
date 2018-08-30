package Patterns;

import java.util.Scanner;

public class PatternTraingle {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int nsp = n - 1;
		int nst = 1;
		int val = 1;
		for (int i = 0; i < n; i++) {

			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("\t");
			}
			if (nst == 1) {
				for (int cst = 1; cst <= nst; cst++) {
					System.out.print(val + "\t");
				}
			} else {
				for (int cst = 1; cst <= (nst + 1) / 2; cst++) {
					System.out.print(val + "\t");
					val++;
				}
				val = val - 1;
				;
				for (int cst = 1; cst <= nst / 2; cst++) {
					val--;
					System.out.print(val + "\t");
				}

			}

			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("\t");
			}
			System.out.println();
			nsp = nsp - 1;
			nst = nst + 2;
			val++;
		}
	}
}
