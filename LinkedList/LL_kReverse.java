public void kReverse(int k) throws Exception {

		LinkedList prev = null;
		LinkedList curr = null;

		while (this.size != 0) {

			curr = new LinkedList();
			for (int i = 0; i < k; i++) {
				curr.addFirst(this.removeFirst());
			}

			if (prev == null) {
				prev = curr;
			} else {
				prev.tail.next = curr.head;
				prev.tail = curr.tail;
				prev.size += curr.size;
			}

		}

		this.head=prev.head;
		this.tail=prev.tail;
		
	}
