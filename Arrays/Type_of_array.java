package GeeksForGeeks;

import java.util.Scanner;

public class Type_of_array {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int t = s.nextInt();

		for (int k = 0; k < t; k++) {

			int n = s.nextInt();
			int arr[] = new int[n];
			int max = Integer.MIN_VALUE;
			for (int i = 0; i < n; i++) {
				arr[i] = s.nextInt();
				if (max < arr[i]) {
					max = arr[i];
				}
			}

			int toa = 0;
			
			int asc=0,dsc=0;
			
			for(int i=0;i<n-1;i++) {
				
				if(arr[i]>arr[i+1]) {
					dsc++;
				}else {
					asc++;
				}
			}
			
			if(asc==n) {
				toa=1;
			}else if(dsc==n) {
				toa=2;
			}else if(asc>dsc) {
				toa=4;
			}else if(asc<dsc) {
				toa=3;
			}
			
			System.out.println(max+" "+toa);
			
		
		}		

	}
}
