public static int mazePathBUSlider(int er, int ec) {
		int[] strg = new int[ec + 1];

		for (int i = 0; i < strg.length; i++) {
			strg[i] = 1;
		}
		for (int j = 0; j < er; j++) {
			for (int i = 1; i < strg.length; i++) {
				strg[i] = strg[i] + strg[i - 1];
			}
		}
		return strg[strg.length - 1];
	}
