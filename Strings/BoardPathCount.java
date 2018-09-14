
public class BoardPathCount {
	public static void main(String[] args) {

		System.out.println(printBoardPath(0, 10));

	}

	private static int printBoardPath(int curr, int end) {

		if (curr == end) {
			return 1;
		}

		if (curr > end) {
			return 0;
		}

		int count = 0;

		for (int dice = 1; dice <= 6; dice++) {
			count += printBoardPath(curr + dice, end);
		}

		return count;
	}
}
