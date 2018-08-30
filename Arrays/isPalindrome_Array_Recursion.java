import java.util.Scanner;

public class isPalindrome_Array_Recursion {
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		int n=s.nextInt();
		int[]arr=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		
		System.out.println(isPalindrome(arr,0,arr.length-1,0));
		
	}

	private static boolean isPalindrome(int[] arr, int i, int j,int count) {
		
		if(i>j) {
			
			if(count==(arr.length+1)/2) {
				return true;
			}else {
				return false;
			}
			
		}
		
		
		if(arr[i]==arr[j]) {
			return isPalindrome(arr, i+1, j-1, count+1);
		}else {
			return isPalindrome(arr, i+1, j-1, count);
		}
		
		
	}
}
