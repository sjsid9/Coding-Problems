package GeeksForGeeks;

import java.util.Scanner;

public class ThirdLargestElement {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();

		for (int k = 0; k < t; k++) {

			int n = s.nextInt();
			int arr[] = new int[n];

			for(int i=0;i<n;i++) {
				arr[i]=s.nextInt();
			}
			
			int first = arr[0];
			int second = Integer.MIN_VALUE;
			int third = Integer.MIN_VALUE;
			
			for(int i=1;i<n;i++) {
				if(arr[i]>first) {
					third=second;
					second=first;
					first=arr[i];
				}else if(arr[i]>second) {
					third=second;
					second=arr[i];
				}else if(arr[i]>third){
					third=arr[i];
				}
			}
			
			System.out.println(third);
			

		}

	}
}
