import java.util.Scanner;

public class DuplicateCharacterFormatting_Recursion {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		duplicateCharacterFormatting(str, "");
	}

	private static void duplicateCharacterFormatting(String str, String asf) {

		if (str.equals("")) {
			System.out.println(asf);
			return;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		if (!ros.equals("") && ch == ros.charAt(0)) {
			duplicateCharacterFormatting(ros, asf + ch+"*");
		} else {
			duplicateCharacterFormatting(ros, asf + ch);
		}

	}
	}