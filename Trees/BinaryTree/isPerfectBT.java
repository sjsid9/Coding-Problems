public boolean isPerfectBT() {
		Pair_PerfectBT pair = new Pair_PerfectBT();
		int height = isPerfectBT(this.root, pair);

		if (pair.node_count == (int) (Math.pow(2, height + 1) - 1)) {
			return true;
		} else {
			return false;
		}

	}

	private int isPerfectBT(Node node, Pair_PerfectBT pair) {
		if (node == null) {
			return -1;
		}

		pair.node_count++;

		int lh = isPerfectBT(node.left, pair);
		int rh = isPerfectBT(node.right, pair);

		return Math.max(lh, rh) + 1;

	}

	class Pair_PerfectBT {
		int node_count;
	}
