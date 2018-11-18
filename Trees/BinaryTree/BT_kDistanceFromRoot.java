	public void kDistanceFromRoot(int k) {
		kDistanceFromRoot(this.root, 0, k);
	}

	private void kDistanceFromRoot(Node node, int dis, int k) {

		if (node == null) {
			return;
		}

		if (dis == k) {
			System.out.println(node.data);
		}

		kDistanceFromRoot(node.left, dis + 1, k);
		kDistanceFromRoot(node.right, dis + 1, k);

	}

