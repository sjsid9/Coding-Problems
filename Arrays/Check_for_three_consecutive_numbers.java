package GeeksForGeeks;

import java.util.Scanner;

public class Check_for_three_consecutive_numbers {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		
		for(int k=0;k<t;k++) {
			
			int n=s.nextInt();
			
			if(n%3==0) {
				int ans=n/3;
				System.out.print(ans-1+" "+ans+" "+(ans+1)+" ");
			}else {
				System.out.println(-1);
			}
			
			System.out.println();
		}
		
	}
}
