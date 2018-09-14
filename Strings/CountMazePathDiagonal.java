
public class CountMazePathDiagonal {
	public static void main(String[] args) {

		System.out.println(printMazePath(0, 0, 2, 2));

	}

	private static int printMazePath(int cr, int cc, int er, int ec) {

		if (cr == er && cc == ec) {
			return 1;
		}

		if (cr > er || cc > ec) {
			return 0;
		}

		int h = printMazePath(cr + 1, cc, er, ec);
		int v = printMazePath(cr, cc + 1, er, ec);
		int d = printMazePath(cr + 1, cc + 1, er, ec);

		return h + v + d;
	}
}
