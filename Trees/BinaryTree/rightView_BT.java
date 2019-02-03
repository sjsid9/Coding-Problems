	public void rightView() {
		rightView(this.root);
	}

	private void rightView(Node node) {
		LinkedList<Node> queue = new LinkedList<>();
		LinkedList<Node> helper = new LinkedList<>();

		queue.addLast(node);
		int hello = 1;
		while (!queue.isEmpty()) {

			Node rn = queue.removeFirst();

			if (hello == 1) {
				System.out.print(rn.data + " ");
				hello = 0;
			}

			if (rn.right != null) {
				helper.addLast(rn.right);
			}

			if (rn.left != null) {
				helper.addLast(rn.left);
			}

			if (queue.isEmpty()) {
				queue = helper;
				helper = new LinkedList<>();
				hello = 1;
			}

		}

	}
