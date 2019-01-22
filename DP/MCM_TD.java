public static int MCMTD(int[] arr, int si, int ei, int[][] strg) {

		if (si + 1 == ei) {
			return 0;
		}

		int min = Integer.MAX_VALUE;

		if (strg[si][ei] != 0) {
			return strg[si][ei];
		}

		for (int k = si + 1; k <= ei - 1; k++) {

			int fc = MCM(arr, si, k);
			int sc = MCM(arr, k, ei);
			int sw = arr[ei] * arr[k] * arr[si];

			int ta = sw + fc + sc;

			if (ta < min) {
				min = ta;
			}

		}

		strg[si][ei] = min;
		return min;
	}
