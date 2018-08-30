import java.util.Scanner;

public class IsReverse_Recursion {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		String str2=s.nextLine();
		
		int n;
		if(str1.length()>str2.length()) {
			n=str1.length();
		}else {
			n=str2.length();
		}
		
		System.out.println(isReverse(str1,str2,0,str2.length()-1,n,0));
		
		
	}

	private static boolean isReverse(String str1, String str2, int sidx, int eidx,int length,int count) {
		
		if(count==length) {
			return true;
		}
		
		char ch1=str1.charAt(sidx);
		char ch2=str2.charAt(eidx);
		
		if(ch1==ch2) {
			return isReverse(str1, str2, sidx+1, eidx-1,length,count+1);
		}else {
			return false;
		}
		
	}
}
