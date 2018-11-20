	public void maximumWidthOfTree() {
		maximumWidthOfTree(this.root);
	}

	private void maximumWidthOfTree(Node node) {

		LinkedList<Node> queue = new LinkedList<>();
		LinkedList<Node> helper = new LinkedList<>();

		queue.addLast(node);

		int width = 0;

		while (!queue.isEmpty()) {

			Node rn = queue.removeFirst();

			if (rn.left != null) {
				helper.addLast(rn.left);
			}

			if (rn.right != null) {
				helper.addLast(rn.right);
			}

			if (queue.isEmpty()) {
				if (helper.size() > width) {
					width = helper.size();
				}
				queue = helper;
				helper = new LinkedList<>();
			}
		}
		System.out.println(width);
	}
