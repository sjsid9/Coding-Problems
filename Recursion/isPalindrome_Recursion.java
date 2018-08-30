import java.util.Scanner;

public class isPalindrome_Recursion {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		
		System.out.println(isPalindrome(str1,str1.length()-1,0,0));
		
	}

	private static boolean isPalindrome(String str1, int eidx, int sidx,int count) {
	
		if(count==(str1.length()+1)/2) {
			return true;
		}
		
		char ch1=str1.charAt(sidx);
		char ch2=str1.charAt(eidx);
		
		if(ch1==ch2) {
			return isPalindrome(str1, eidx-1, sidx+1, count+1);
		}else {
			return false;
		}
		
	}
	
}
