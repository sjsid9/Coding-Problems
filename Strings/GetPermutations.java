import java.util.ArrayList;
import java.util.Scanner;

public class GetPermutations {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.println(getPermuattions(str));

	}

	private static ArrayList<String> getPermuattions(String str) {

		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> rr = getPermuattions(ros);
		ArrayList<String> mr = new ArrayList<>();

		for (String rrs : rr) {

			for (int i = 0; i <= rrs.length(); i++) {

				String val = rrs.substring(0, i) + ch + rrs.substring(i);
				mr.add(val);

			}

		}

		return mr;
	}
}
