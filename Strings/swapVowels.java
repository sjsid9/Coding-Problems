import java.util.Scanner;

public class SwapVowels {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String str = s.next();

		int left = 0;
		int right = str.length() - 1;

		while (left < right) {

			while (str.charAt(left) != 'a' && str.charAt(left) != 'e' && str.charAt(left) != 'i'
					&& str.charAt(left) != 'o' && str.charAt(left) != 'u') {
				left++;
			}

			while (str.charAt(right) != 'a' && str.charAt(right) != 'e' && str.charAt(right) != 'i'
					&& str.charAt(right) != 'o' && str.charAt(right) != 'u') {
				right--;
			}

			if (left <= right) {

				if (str.charAt(left) == str.charAt(right)) {
					left++;
					right--;
				} else {

					str = str.substring(0, left) + str.charAt(right) + str.substring(left + 1, right) + str.charAt(left)
							+ str.substring(right + 1);
					left++;
					right--;
				}
			}

		}
		System.out.println(str);
	}
}

