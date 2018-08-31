package GeeksForGeeks;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_in_specific_order {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		
		for(int k=0;k<t;k++) {
			int n=s.nextInt();
			int arr[]=new int[n];
			
			int odd=0,even=0;
			
			for(int i=0;i<n;i++) {
				arr[i]=s.nextInt();
				if(arr[i]%2==0) {
					even++;
				}else {
					odd++;
				}
			}
			
			int oddar[]=new int[odd];
			int evenar[]=new int[even];
			
			int count1=0,count2=0;
			
			for(int i=0;i<n;i++) {
				if(arr[i]%2==0) {
					evenar[count1]=arr[i];
					count1++;
				}else {
					oddar[count2]=arr[i];
					count2++;
				}
			}
			
			Arrays.sort(oddar);
			Arrays.sort(evenar);
			
			for(int i=oddar.length-1;i>=0;i--) {
				System.out.print(oddar[i]+" ");
			}
			
			for(int i=0;i<evenar.length;i++) {
				System.out.print(evenar[i]+" ");
			}
			System.out.println();
		}
		
	}
}
