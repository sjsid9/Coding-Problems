import java.util.Scanner;

public class RECURSION_WHAT_IS_IN_THE_PARENTHESIS {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		whatInParanthesis(str, "", false);

	}

	private static void whatInParanthesis(String str, String asf, boolean paran) {

		char ch = str.charAt(0);
		String ros = str.substring(1);

		if (ch == '(')
			paran = true;

		if (paran) {
			char tem = ros.charAt(0);
			if (tem != ')') {
				asf += tem;
			} else {
				System.out.println(asf);
				return;
			}
			whatInParanthesis(ros, asf, true);
		} else {
			whatInParanthesis(ros, asf, false);
		}
	}

}
