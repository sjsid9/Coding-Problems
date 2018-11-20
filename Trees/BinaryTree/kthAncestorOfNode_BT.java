	public void kthAncestorOfNode(int k, int data) {
		int[] ancestors = new int[this.size2()];
		kthAncestorOfNode(this.root, ancestors, k, data);
	}

	private void kthAncestorOfNode(Node node, int ancestors[], int k, int data) {

		LinkedList<Node> queue = new LinkedList<>();
		LinkedList<Node> helper = new LinkedList<>();

		queue.addLast(node);
		ancestors[0] = -1;
		int count = 1;
		while (!queue.isEmpty()) {

			Node rn = queue.removeFirst();
			helper.addLast(rn);

			if (rn.left != null) {
				queue.addLast(rn.left);
				ancestors[count] = rn.data;
				count++;
			}

			if (rn.right != null) {
				queue.addLast(rn.right);
				ancestors[count] = rn.data;
				count++;
			}

		}

		Object[] q = helper.toArray();
		int ans = 0;

		for (int j = 0; j < k; j++) {
			for (int i = 0; i < q.length; i++) {
				Node nn = (Node) q[i];
				if (nn.data == data) {
					ans = i;
				}
			}
			data = ancestors[ans];
		}
		int parent = ancestors[ans];
		System.out.println(parent);
	}

