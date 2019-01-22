	public static int MCMBU(int[] arr) {

		int n = arr.length;

		int[][] strg = new int[n][n];

		for (int slide = 2; slide <= n - 1; slide++) {

			for (int si = 0; si <= n - slide - 1; si++) {

				int ei = si + slide;

				int min = Integer.MAX_VALUE;

				for (int k = si + 1; k <= ei - 1; k++) {

					int fc = strg[si][k];
					int sc = strg[k][ei];
					int sw = arr[ei] * arr[k] * arr[si];

					int ta = sw + fc + sc;

					if (ta < min) {
						min = ta;

					}

					strg[si][ei] = min;

				}

			}

		}
		return strg[0][n - 1];
	}
