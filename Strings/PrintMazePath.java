
public class PrintMazePath {
	public static void main(String[] args) {

		printMazePath(0, 0, 2, 2, "");

	}

	private static void printMazePath(int cr, int cc, int er, int ec, String ans) {

		if (cr == er && cc == ec) {
			System.out.println(ans);
			return;
		}

		if (cr > er || cc > ec) {
			return;
		}

		printMazePath(cr + 1, cc, er, ec, ans + "H");
		printMazePath(cr, cc + 1, er, ec, ans + "V");

	}
}
