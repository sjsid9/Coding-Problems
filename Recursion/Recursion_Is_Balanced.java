import java.util.Scanner;

public class Recursion_Is_Balanced {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		
		System.out.println(isBalanced(str,true,true,true));
		
	}

	private static boolean isBalanced(String str,boolean b1,boolean b2,boolean b3) {
		
		if(str.equals("")) {
			if(b1 && b2 && b3) {
				return true;
			}else {
				return false;
			}
		}
		
		
		char ch=str.charAt(0);
		String ros=str.substring(1);
		
		if(ch=='[') {
			return isBalanced(ros, false, b2, b3);
		}if(ch=='{') {
			return isBalanced(ros, b1, false, b3);
		}if(ch=='(') {
			return isBalanced(ros, b1, b2, false);
		}if(ch==']') {
			return isBalanced(ros, true, b2, b3);
		}if(ch=='}') {
			return isBalanced(ros, b1, true, b3);
		}if(ch==')') {
			return isBalanced(ros, b1, b2, true);
		}else {
			return isBalanced(ros, b1, b2, b3);
		}
		
	}
}
