import java.util.ArrayList;
import java.util.Scanner;

public class KeypadCodes {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str = s.next();

		System.out.println(KPC(str));

	}

	private static ArrayList<String> KPC(String str) {

		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> rr = KPC(ros);
		ArrayList<String> mr = new ArrayList<>();

		String code = getCode(ch);

		for (int i = 0; i < code.length(); i++) {

			for (String ss : rr) {
				mr.add(code.charAt(i) + ss);
			}

		}

		return mr;
	}

	public static String getCode(char ch) {

		if (ch == '1') {
			return "abc";
		} else if (ch == '2') {
			return "def";
		} else if (ch == '3') {
			return "ghi";
		} else if (ch == '4') {
			return "jkl";
		} else if (ch == '5') {
			return "mno";
		} else if (ch == '6') {
			return "pqrs";
		} else if (ch == '7') {
			return "tuv";
		} else if (ch == '8') {
			return "wx";
		} else if (ch == '9') {
			return "yz";
		} else if (ch == '0') {
			return "@#";
		} else {
			return "";
		}

	}

}
