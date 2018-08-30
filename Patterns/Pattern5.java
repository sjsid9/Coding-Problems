package Patterns;
import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int nsp=0;
		int nst=n;
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=nsp;j++) {
				System.out.print(" ");
			}
			
			for(int k=1;k<=nst;k++) {
				System.out.print("*");
			}
			System.out.println();
			nst--;
			nsp++;
		}

	}

}
