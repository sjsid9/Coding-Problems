public int getLevel(int key) {
		return getLevel(this.root, key, 1);

	}

	public static int getLevel(Node node, int key, int level) {

		if (node == null) {
			return 0;
		}

		if (node.data == key) {
			return level;
		}

		int lc = getLevel(node.left, key, level + 1);
		int rc = getLevel(node.right, key, level + 1);

		return Math.max(lc, rc);

	}
