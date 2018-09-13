import java.util.Scanner;

public class PrintSubsequencesRecursively {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String str = s.next();

		subsequences(str, "");
	}

	public static void subsequences(String str, String output) {

		if (str.length() == 0) {
			System.out.println(output);
			return;
		}

		subsequences(str.substring(1), output);
		subsequences(str.substring(1), output + str.charAt(0));

	}

}
