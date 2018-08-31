package GeeksForGeeks;

import java.util.Scanner;

public class Immediate_Smaller_Element {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		
		for(int k=0;k<t;k++) {
			
			int n=s.nextInt();
			int arr[]=new int[n];
			
			for(int i=0;i<n;i++) {
				arr[i]=s.nextInt();
			}
			
			for(int i=0;i<n-1;i++) {
				if(arr[i]>arr[i+1]) {
					System.out.print(arr[i+1]+" ");
				}else {
					System.out.print(-1+" ");
				}
			}
			
			System.out.println(-1);
			
		}
		s.close();
	}
}
