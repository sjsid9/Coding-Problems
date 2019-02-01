private boolean isPalindrome(Node head) {
		java.util.LinkedList<Node> stack = new java.util.LinkedList<Node>();

		Node temp = head;

		while (head != null) {
			stack.addFirst(head);
			head = head.next;
		}
		boolean flag = true;
		while (!stack.isEmpty()) {
			Node rv = stack.removeFirst();
			if (flag && rv.data == temp.data) {
				temp = temp.next;
			} else {
				flag = false;
				break;
			}
		}

		if (flag) {
			return true;
		} else {
			return false;
		}

	}
