	public int oddEvenLevelDifference() {
		return oddEvenLevelDifference(this.root);
	}

	private int oddEvenLevelDifference(Node node) {

		LinkedList<Node> queue = new LinkedList<>();
		LinkedList<Node> helper = new LinkedList<>();

		queue.addLast(node);
		int sum = node.data;
		int count = 0;
		while (!queue.isEmpty()) {

			Node rn = queue.removeFirst();

			if (rn.left != null) {
				helper.addLast(rn.left);

				if (count % 2 == 0) {
					sum -= rn.left.data;
				} else {
					sum += rn.left.data;
				}

			}

			if (rn.right != null) {
				helper.addLast(rn.right);

				if (count % 2 == 0) {
					sum -= rn.right.data;
				} else {
					sum += rn.right.data;
				}

			}

			if (queue.isEmpty()) {
				queue = helper;
				helper = new LinkedList<>();
				count++;
			}

		}
		return sum;
	}

