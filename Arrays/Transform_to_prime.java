package GeeksForGeeks;

import java.util.Scanner;

public class Transform_to_prime {

	public static void main(String[] args) {
		
		boolean arr[]=makeSeive(1000);
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		
		for(int k=0;k<t;k++) {
			int n=s.nextInt();
			int ar[]=new int[n];
			int sum=0;
			for(int i=0;i<n;i++) {
				ar[i]=s.nextInt();
				sum+=ar[i];
			}
			int res=0;
			for(int i=0;i<arr.length;i++) {
				if(arr[i] && i>=sum) {
					res=i-sum;
					break;
				}
			}
			
			System.out.println(res);
			
		}
		

	}

	private static boolean[] makeSeive(int n) {

		boolean prime[] = new boolean[n + 1];

		for (int i = 0; i < n; i++) {
			prime[i] = true;
		}

		for (int i = 2; i * i <= n; i++) {
			if (prime[i] == true) {
				for (int j = 2 * i; j <= n; j += i) {
					prime[j] = false;
				}
			}
		}

//		for (int i = 2; i < n; i++) {
//			if (prime[i]) {
//				System.out.println(i);
//			}
//		}
		
		return prime;

	}

}
