public void removeDuplicatesUnsortedLL() {
		removeDuplicatesUnsortedLL(this.head);
	}

	private void removeDuplicatesUnsortedLL(Node head) {
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(head.data, 1);
		while (head.next != null) {
			if (map.containsKey(head.next.data)) {
				head.next = head.next.next;
			} else {
				map.put(head.next.data, 1);
				head = head.next;
			}
		}
	}
