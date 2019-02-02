public void Sort012() {
		Sort012(this.head);
	}

	private void Sort012(Node head) {
		Node temp = head;
		int n1 = 0, n2 = 0, n3 = 0;
		while (head != null) {
			if (head.data == 0) {
				n1++;
			} else if (head.data == 1) {
				n2++;
			} else {
				n3++;
			}
			head = head.next;
		}

		while (temp != null) {
			if (n1 > 0) {
				temp.data = 0;
				n1--;
			} else if (n2 > 0) {
				temp.data = 1;
				n2--;
			} else {
				temp.data = 2;
				n3--;
			}
			temp = temp.next;
		}
	}
