package GeeksForGeeks;

import java.util.Scanner;

public class Palindromic_Array {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		int t=s.nextInt();
		for(int k=0;k<t;k++) {
			
			int n=s.nextInt();
			
			int arr[]= new int[n];
			int count=0;
			for(int i=0;i<n;i++) {
				
				arr[i]=s.nextInt();
				count+=isPalindrome(arr[i]);
			}
			
			if(count==n) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
			
		}
		
	}

	private static int isPalindrome(int num) {
		
		String str=Integer.toString(num);
		int c=0;
		for(int i=0;i<(str.length()+1)/2;i++) {
			if(str.charAt(i)==str.charAt(str.length()-1-i)) {
				c++;
			}
		}
		
		if(c==(str.length()+1)/2) {
			return 1;
		}
		
		return 0;
	}
}
