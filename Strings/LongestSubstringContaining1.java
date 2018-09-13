import java.util.Scanner;

public class LongestSubstringContaining1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.println(count(str));

	}

	public static int count(String s) {
		int c = 0, min = Integer.MIN_VALUE;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == '1' && s.charAt(i + 1) == '1' || s.charAt(i) == '1' && s.charAt(i + 1) == '0') {
				c++;
			} else {
				if (c > min) {
					min = c;
				}
				c = 0;
			}
		}

		if (s.charAt(s.length() - 1) == '1') {
			c++;
		}

		return Math.max(min, c);

	}

}
