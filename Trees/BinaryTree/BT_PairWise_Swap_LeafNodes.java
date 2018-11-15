	public void pairWiseSwap() {
		pairWiseSwap(this.root);
	}

	private static class pairSwap {
		static int count = 0;
		static Node firstNode;
		static Node secondNode;
	}

	private void pairWiseSwap(Node node) {

		if (node == null) {
			return;
		}

		if (node.left == null && node.right == null) {
			pairSwap.count++;
			if (pairSwap.count % 2 == 0) {
				pairSwap.secondNode = node;
				int temp = pairSwap.firstNode.data;
				pairSwap.firstNode.data = pairSwap.secondNode.data;
				pairSwap.secondNode.data = temp;
			} else {
				pairSwap.firstNode = node;
				pairSwap.secondNode = node;
			}

		}

		pairWiseSwap(node.left);
		pairWiseSwap(node.right);

	}
