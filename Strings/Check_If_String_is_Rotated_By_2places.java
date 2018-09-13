import java.util.*;

public class Check_If_String_is_Rotated_By_2places {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int t = s.nextInt();

		for (int k = 0; k < t; k++) {

			String a = s.next();
			String b = s.next();

			if (a.substring(0, 2).equals(b.substring(b.length() - 2, b.length()))) {
				if (a.substring(2, a.length()).equals(b.substring(0, b.length() - 2))) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
			} else if (a.substring(a.length() - 2, a.length()).equals(b.substring(0, 2))) {
				if (a.substring(0, a.length() - 2).equals(b.substring(2, b.length()))) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
			}

			else {
				System.out.println(0);
			}

		}

	}
}
