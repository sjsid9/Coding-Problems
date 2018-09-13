import java.util.ArrayList;
import java.util.Scanner;

public class GetSubsequencesASCII {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String str = s.next();
		System.out.println(getSubsequences(str));

	}

	public static ArrayList<String> getSubsequences(String str) {

		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> rr = getSubsequences(ros);
		ArrayList<String> mr = new ArrayList<>();
		for (String ss : rr) {
			mr.add(ss);
			mr.add(ch + ss);
			mr.add((int) ch + ss);
		}

		return mr;
	}

}
