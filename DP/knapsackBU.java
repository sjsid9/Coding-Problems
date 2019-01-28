public static int knapsackBU(int[] wt, int[] price, int cap) {

		int nr = wt.length + 1;
		int nc = cap + 1;
		int[][] strg = new int[nr][nc];

		for (int row = 1; row < nr; row++) {

			for (int col = 1; col < nc; col++) {

				if (col < wt[row - 1]) {
					strg[row][col] = strg[row - 1][col];
				} else {
					int include = price[row - 1] + strg[row - 1][col - wt[row - 1]];
					int exclude = strg[row - 1][col];
					strg[row][col] = Math.max(include, exclude);
				}

			}

		}
		return strg[nr - 1][nc - 1];
	}
