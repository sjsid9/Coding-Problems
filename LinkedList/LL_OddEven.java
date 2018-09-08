public void LLOddEven() throws Exception {

		if (this.head == null) {
			return;
		}

		Node odd = new Node();
		Node even = new Node();

		odd = this.head;
		even = this.head.next;

		Node evenFirst = new Node();
		evenFirst = even;
		Node hh = new Node();
		hh = evenFirst;
		while (odd.next != null) {

			odd.next = even.next;
			if (odd.next != null) {
				odd = even.next;
				even = odd.next;
				evenFirst.next = odd.next;
				evenFirst = even;
			}
		}

		odd.next = hh;

	}
