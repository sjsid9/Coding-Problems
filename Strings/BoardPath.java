import java.util.ArrayList;

public class BoardPath {
	public static void main(String[] args) {

		System.out.println(getBoardPath(0, 100));

	}

	private static ArrayList<String> getBoardPath(int curr, int end) {

		if (curr == end) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		if (curr > end) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}

		ArrayList<String> mr = new ArrayList<>();

		for (int dice = 1; dice <= 6; dice++) {

			ArrayList<String> rr = getBoardPath(dice + curr, end);

			for (String rrs : rr) {
				mr.add(dice + rrs);
			}

		}

		return mr;

	}
}
