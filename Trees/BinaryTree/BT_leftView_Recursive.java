	public void leftViewRecursive() {
		leftViewRecursive(this.root, 1);
	}

	private static class levelOfTree {
		static int level = 0;
	}

	private void leftViewRecursive(Node node, int level) {

		if (node == null) {
			return;
		}

		if (levelOfTree.level < level) {
			System.out.println(node.data);
			levelOfTree.level = level;
		}

		leftViewRecursive(node.left, level + 1);
		leftViewRecursive(node.right, level + 1);

	}
