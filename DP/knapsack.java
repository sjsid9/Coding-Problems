public static int knapsack(int[] wt, int[] price, int vidx, int cap) {

		if (vidx == wt.length) {
			return 0;
		}

		int include = 0;

		if (cap >= wt[vidx])
			include = price[vidx] + knapsack(wt, price, vidx + 1, cap - wt[vidx]);
		int exclude = knapsack(wt, price, vidx + 1, cap);

		int max = Math.max(include, exclude);

		return max;

	}
