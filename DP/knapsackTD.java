	public static int knapsackTD(int[] wt, int[] price, int vidx, int cap, int[][] strg) {

		if (vidx == wt.length) {
			return 0;
		}

		int include = 0;
		if (strg[vidx][cap] != 0) {
			return strg[vidx][cap];
		}
		if (cap >= wt[vidx])
			include = price[vidx] + knapsack(wt, price, vidx + 1, cap - wt[vidx]);
		int exclude = knapsack(wt, price, vidx + 1, cap);

		int max = Math.max(include, exclude);
		strg[vidx][cap] = max;
		return max;

	}
