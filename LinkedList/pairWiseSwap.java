	public void pairwiseSwap() {
		pairwiseSwap(this.head);
	}
	
	public void pairwiseSwap(Node node) {

		while (node.next != null && node.next.next != null) {
			int temp = node.data;
			node.data = node.next.data;
			node.next.data = temp;

			node = node.next.next;
		}

		if (node.next != null) {
			int temp = node.data;
			node.data = node.next.data;
			node.next.data = temp;
		}

	
