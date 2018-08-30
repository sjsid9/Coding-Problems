import java.util.Scanner;

public class RECURSION_CONVERT_STRING_TO_INTEGER {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		convertStrToInt(a, 0, a.length() - 1, 0);
	}

	private static void convertStrToInt(String a, int vidx, int i, int sum) {

		if (vidx == a.length()) {
			System.out.println(sum);
			return;
		}

		double num = Character.getNumericValue(a.charAt(vidx));
		num = num * Math.pow(10, i);

		sum += num;

		convertStrToInt(a, vidx + 1, i - 1, sum);

	}
}
