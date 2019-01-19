public static int fibonacciIBtr(int n) {
		int[] strg = new int[2];
		strg[0] = 0;
		strg[1] = 1;

		for (int i = 2; i <= n; i++) {
			int temp = strg[1];
			strg[1] = strg[0] + strg[1];
			strg[0] = temp;
		}
		return strg[1];
	}

