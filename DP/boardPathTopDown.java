public static int boardPathTD(int curr, int end, int[] strg) {

		if (curr == end) {
			return 1;
		}

		if (curr > end) {
			return 0;
		}

		if (strg[curr] != 0) {
			return strg[curr];
		}

		int res = 0;

		for (int dice = 1; dice <= 6; dice++) {
			res += boardPathTD(curr + dice, end, strg);
		}
		strg[curr] = res;
		return res;
	}
