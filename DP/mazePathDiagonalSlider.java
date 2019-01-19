public static int mazePathDiagSlider(int er, int ec) {
		int[] strg = new int[ec + 1];

		for (int i = 0; i < strg.length; i++) {
			strg[i] = 1;
		} // Arrays.fills(strg,1);
		for (int j = 0; j < er; j++) {
			int diag = 1;
			for (int i = 1; i < strg.length; i++) {

				int val = strg[i] + strg[i - 1] + diag;
				diag = strg[i];
				strg[i] = val;
			}
		}
		return strg[strg.length - 1];
	}
