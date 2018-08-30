import java.util.Scanner;

public class Recursion_Twins {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String str=s.nextLine();
		findTwins(str,0);
		
	}

	private static void findTwins(String str, int count) {
		
		if(str.equals("")) {
			System.out.println(count);
			return;
		}
		
		char ch=str.charAt(0);
		String ros=str.substring(1);
		
		if(!ros.equals("") && ros.length()>=2 && ch==ros.charAt(1)) {
			findTwins(ros, count+1);
		}else {
			findTwins(ros, count);
		}
		
		
	}
}
