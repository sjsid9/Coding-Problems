import java.util.ArrayList;

public class MazePathDiagonal {
	public static void main(String[] args) {

		System.out.println(getMazePath(0, 0, 2, 2));

	}

	private static ArrayList<String> getMazePath(int cr, int cc, int er, int ec) {

		if (cr == er && cc == ec) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		if (cr > er || cc > ec) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}

		ArrayList<String> mr = new ArrayList<>();

		ArrayList<String> rrh = getMazePath(cr + 1, cc, er, ec);

		for (String rrhs : rrh) {
			mr.add("H" + rrhs);
		}

		ArrayList<String> rrv = getMazePath(cr, cc + 1, er, ec);

		for (String rrvs : rrv) {
			mr.add("V" + rrvs);
		}

		ArrayList<String> rrd = getMazePath(cr + 1, cc + 1, er, ec);
		for (String rrds : rrd) {
			mr.add("D" + rrds);
		}

		return mr;
	}
}
