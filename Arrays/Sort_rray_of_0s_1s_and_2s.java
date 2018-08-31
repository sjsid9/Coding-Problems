package GeeksForGeeks;

import java.util.Scanner;

public class Sort_rray_of_0s_1s_and_2s {
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		int t=s.nextInt();
		
		for(int g=0;g<t;g++) {
			
			int n=s.nextInt();
			int arr[]=new int[n];
			
			for(int i=0;i<n;i++) {
				arr[i]=s.nextInt();
			}
			
			sort012(arr);
			System.out.println();
			
		}
		
	}

	private static void sort012(int[] arr) {
		
		int lo=0;
		int mid=0;
		int temp=0;
		int hi=arr.length-1;
		
		while(mid<=hi) {
			
			switch(arr[mid]) {
			
			case 0:
			{
				temp=arr[lo];
				arr[lo]=arr[mid];
				arr[mid]=temp;
				lo++;
				mid++;
				break;
			}
			
			case 1:
			{
				mid++;
				break;
			}
			
			case 2:
			{
				temp=arr[mid];
				arr[mid]=arr[hi];
				arr[hi]=temp;
				hi--;
				break;
			}
			
			}
			
			
		}
		
		for(int val:arr) {
			System.out.print(val+" ");
		}
		
		
	}
}
