	public void deleteNafterMnodes(int m, int n) {
		deleteNafterMnodes(this.head, m, n);
	}

	private void deleteNafterMnodes(Node node, int m, int n) {

		Node temp = node;
		while (node != null && node.next != null) {
			int i = 0;
			while (i < m - 1 && node != null) {
				node = node.next;
				temp = temp.next;
				i++;
			}
			i = 0;
			while (i < n && node != null) {
				node = node.next;
				i++;
			}

			if (node != null && node.next == null) {
				temp.next = null;
				break;
			}

			else {

				if (node == null) {
					break;
				}

				temp.next = node.next;
				temp = temp.next;
				node = temp;
			}
			i = 0;

		}

	}
