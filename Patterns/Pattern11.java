package Patterns;

import java.util.Scanner;

public class Pattern11 {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int nsp=n-1;
		int nst=1;
		
		for(int i=1;i<=n;i++) {
			
			for(int csp=1;csp<=nsp;csp++) {
				System.out.print(" ");
			}
			
			for(int cst=1;cst<=nst;cst++) {
				System.out.print("*");
				System.out.print(" ");
			}
			
			for(int csp=1;csp<=nsp-1;csp++) {
				System.out.print(" ");
			}
			System.out.println();
			nsp--;
			nst++;
			
		}
		
	}
}
