	private static int boardPathBUSlider(int n) {
		int strg[] = new int[6];
		strg[0] = 1;

		for (int slide = 1; slide <= n; slide++) {
			int sum = strg[0] + strg[1] + strg[2] + strg[3] + strg[4] + strg[5];
			strg[5] = strg[4];
			strg[4] = strg[3];
			strg[3] = strg[2];
			strg[2] = strg[1];
			strg[1] = strg[0];
			strg[0] = sum;

		}

		return strg[0];

	}
