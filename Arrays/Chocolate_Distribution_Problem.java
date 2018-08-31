package GeeksForGeeks;

import java.util.Arrays;
import java.util.Scanner;

public class Chocolate_Distribution_Problem {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		
		for(int k=0;k<t;k++) {
			
			int n=s.nextInt();
			
			int arr[]=new int[n];
			
			for(int i=0;i<n;i++) {
				arr[i]=s.nextInt();
			}
			
			Arrays.sort(arr);
			
			int m=s.nextInt();
			int diff=0;
			int min=Integer.MAX_VALUE;
			for(int i=0;i<=n-m;i++) {
				diff=Math.abs(arr[i]-arr[i+m-1]);
				if(diff<min) {
					min=diff;
				}
			}
			System.out.println(min);
		}
		
	}
}
