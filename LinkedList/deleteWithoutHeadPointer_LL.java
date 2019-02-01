void deleteNode(Node del) {
		if (del == null) {
			return;
		} else {

			del.data = del.next.data;
			del.next = del.next.next;

		}
	}
