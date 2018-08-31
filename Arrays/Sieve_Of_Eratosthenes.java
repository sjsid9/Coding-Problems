package GeeksForGeeks;

import java.util.Scanner;

public class Sieve_Of_Eratosthenes {
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		makeSeive(n);
		
		
	}

	private static void makeSeive(int n) {
		
		boolean prime[]=new boolean[n+1];
		
		for(int i=0;i<n;i++) {
			prime[i]=true;
		}
		
		for(int i=2;i*i<=n;i++) {
			if(prime[i]==true) {
				for(int j=2*i;j<=n;j+=i) {
					prime[j]=false;
				}
			}
		}
		
		for(int i=2;i<n;i++) {
			if(prime[i]) {
				System.out.println(i);
			}
		}
		
	}
}
