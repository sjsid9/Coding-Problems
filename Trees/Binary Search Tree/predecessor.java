public int predecessor(int a) {
		return predecessor(this.root, a);
	}

	private int predecessor(Node node, int a) {
		int store = 0;
		while (node.data != a) {
			if (node.data > a) {
				node = node.left;
			} else {
				store = node.data;
				node = node.right;
			}
		}

		if (node.left != null) {
			node = node.left;
			while (node.right != null) {
				node = node.right;
			}
			return node.data;
		} else {
			return store;
		}

	}
