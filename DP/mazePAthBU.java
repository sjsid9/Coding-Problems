public static int mazePathBU(int er, int ec) {

		int[][] strg = new int[er + 1][ec + 1];
		for (int row = ec; row >= 0; row--) {
			for (int col = er; col >= 0; col--) {
				if (row == ec || col == er) {
					strg[row][col] = 1;
				} else {
					strg[row][col] = strg[row + 1][col] + strg[row][col + 1];
				}
			}
		}

		return strg[0][0];
	}

