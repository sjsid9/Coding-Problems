public Node sortedInsert(Node head1, int key) {
		Node temp = head1;

		if (temp.next == null) {
			if (key > temp.data) {
				Node nn = new Node();
				nn.data = key;
				temp.next = nn;
				nn.next = null;
				return head1;
			} else {
				Node nn = new Node();
				nn.data = key;
				nn.next = temp;
				return nn;
			}
		}

		else {
			while (temp.next != null) {
				if (key < temp.data) {
					Node nn = new Node();
					nn.data = key;
					nn.next = temp;
					return nn;
				}

				else if (key >= temp.data && key < temp.next.data) {
					Node nn = new Node();
					nn.data = key;
					nn.next = temp.next;
					temp.next = nn;
					break;
				} else if (temp.next.next == null && key > temp.next.data) {
					Node nn = new Node();
					nn.data = key;
					temp.next.next = nn;
					nn.next = null;
					break;
				}

				temp = temp.next;
			}
		}

		return head1;

	}
