package GeeksForGeeks;

import java.util.Scanner;

public class Maximum_no_of_1s_row {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		int t=s.nextInt();
		
		for(int k=0;k<t;k++) {
			
			int m=s.nextInt();
			int n=s.nextInt();
			int arr[][]=new int[m][n];
			
			int no_of_1s=0,idx=0;
			int max=Integer.MIN_VALUE;
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					arr[i][j]=s.nextInt();
				}
			}
			
			for(int i=0;i<m;i++) {
				for(int j=0;j<arr[i].length;j++) {
					if(arr[i][j]==1) {
						no_of_1s++;
					}
				}
				
				if(no_of_1s>max) {
					max=no_of_1s;
					idx=i;
				}
				no_of_1s=0;
				
			}
			
			System.out.println(idx);
			
		}
		System.out.println();
	}
}
