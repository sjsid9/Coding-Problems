public LinkedList mergeTwoSortedLL(LinkedList other) {

		Node ttemp = this.head;
		Node otemp = other.head;

		LinkedList rv = new LinkedList();

		while (ttemp != null && otemp != null) {

			if (ttemp.data < otemp.data) {
				rv.addLast(ttemp.data);
				ttemp = ttemp.next;
			} else {
				rv.addLast(otemp.data);
				otemp = otemp.next;
			}
		}

		while (ttemp != null) {
			rv.addLast(ttemp.data);
			ttemp = ttemp.next;
		}

		while (otemp != null) {
			rv.addLast(otemp.data);
			otemp = otemp.next;
		}

		return rv;

	}

	public void mergeSort() {

		if (this.size == 1) {
			return;
		}

		LinkedList fh = new LinkedList();
		LinkedList sh = new LinkedList();

		Node mid = this.mid();
		Node midn = mid.next;

		fh.head = this.head;
		fh.tail = mid;
		fh.tail.next = null;
		fh.size = (this.size + 1) / 2;

		sh.head = midn;
		sh.tail = this.tail;
		sh.tail.next = null;
		sh.size = this.size / 2;

		fh.mergeSort();
		sh.mergeSort();

		LinkedList merged = fh.mergeTwoSortedLL(sh);

		this.head = merged.head;
		this.tail = merged.tail;

	}
