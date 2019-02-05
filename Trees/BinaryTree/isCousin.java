class PairCousin {
		int level = 0;
		int parent = 0;
	}

	public boolean ifCousin(int a, int b) {
		PairCousin pair1 = new PairCousin();
		PairCousin pair2 = new PairCousin();

		nodeValues(this.root, this.root, a, b, 0, pair1, pair2);

		if (pair1.level == pair2.level && pair1.parent != pair2.parent) {
			return true;
		} else {
			return false;
		}

	}

	public void nodeValues(Node parent, Node node, int a, int b, int level, PairCousin mp1, PairCousin mp2) {

		if (node == null) {
			return;
		}

		if (node.data == a) {
			mp1.level = level;
			mp1.parent = parent.data;
		}

		if (node.data == b) {
			mp2.level = level;
			mp2.parent = parent.data;
		}

		nodeValues(node, node.left, a, b, level + 1, mp1, mp2);
		nodeValues(node, node.right, a, b, level + 1, mp1, mp2);

	}
