public boolean isCircular(Node head) {
		Node temp = head;
		boolean a = false;
		while (temp.next != null) {
			if (temp.next.next == null) {
				a = false;
				break;
			} else if (temp.next.data == head.data && temp.next.next.data == head.next.data) {
				a = true;
				break;
			}
			temp = temp.next;
		}
		if (a) {
			return true;
		}
		return false;
	}