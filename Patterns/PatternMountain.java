package Patterns;

import java.util.Scanner;

public class PatternMountain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int nsp = 2*n-3;
		int nst = 1;
		int val = 1;

		for (int i = 0; i < n; i++) {

			if (i != n - 1) {
				for (int cst = 1; cst <= nst; cst++) {
					System.out.print(val+"\t");
					val++;
				}
			} else {
				for (int cst = 1; cst <= n - 1; cst++) {
					System.out.print(val+"\t");
					val++;
				}
			}
			if (i != n - 1) {
				for (int csp = 1; csp <= nsp; csp++) {
					System.out.print("\t");
				}
			} else {
				System.out.print(n+"\t");
			}
			val--;
			if (i != n - 1) {
				for (int cst = 1; cst <= nst; cst++) {
					System.out.print(val+"\t");
					val--;
				}
			} else {
				for (int cst = 1; cst <= n - 1; cst++) {
					System.out.print(val+"\t");
					val--;
				}
			}
			System.out.println();
			nsp = nsp - 2;
			nst = nst + 1;
			val = 1;
		}

	}
}