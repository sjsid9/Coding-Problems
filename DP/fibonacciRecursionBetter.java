private static int fibonacciRBtr(int n, int[] strg) {
		if (n == 1 || n == 0) {
			return n;
		}

		if (strg[n] != 0) {
			return strg[n];
		}

		int fnm1 = fibonacciRBtr(n - 1, strg);
		int fnm2 = fibonacciRBtr(n - 2, strg);
		int fn = fnm1 + fnm2;
		strg[n] = fn;
		return fn;
	}

