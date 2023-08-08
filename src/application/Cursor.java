package application;

public class Cursor {
	Node[] cursorArray;

	public Cursor(int capacity) {
		cursorArray = new Node[capacity];
		initialization();
	}

	/* Initialize the cursor array to null and next index */
	public int initialization() {
		for (int i = 0; i < cursorArray.length - 1; i++)
			cursorArray[i] = new Node(null, i + 1);
		cursorArray[cursorArray.length - 1] = new Node(null, 0);
		return 0;
	}

	/* returns the first node after the header (next of the head) */
	public int malloc() {
		int p = cursorArray[0].getNext();
		cursorArray[0].setNext(cursorArray[p].getNext());
		return p;
	}

	public void free(int p) {
		cursorArray[p] = new Node(null, cursorArray[0].getNext());
		cursorArray[0].setNext(p);
	}

	public boolean isNull(int l) {
		return cursorArray[l] == null;
	}

	// return true if the list is empty
	public boolean isEmpty(int l) {
		return cursorArray[l].getNext() == 0;
	}

	public boolean isLast(int p) {
		return cursorArray[p].getNext() == 0;
	}

	/* create new empty list */
	public int createList() {
		int l = malloc();
		if (l == 0)
			System.out.println("Error: Out of space!!!");
		else
			cursorArray[l] = new Node(null, 0);
		return l;
	}

	public void insertAtHead(Object data, int l) {
		if (isNull(l)) // list not created
			return;
		int p = malloc();
		if (p != 0) {
			cursorArray[p] = new Node(data, cursorArray[l].getNext());
			cursorArray[l].setNext(p);
		} else
			System.out.println("Error: Out of space!!!");
	}

	public void traversList(int l) {
		System.out.print("list_" + l + "-->");
		while (!isNull(l) && !isEmpty(l)) {
			l = cursorArray[l].getNext();
			System.out.print(cursorArray[l] + "-->");
		}
		System.out.println("null");
	}

	public int find(Object data, int l) {
		while (!isNull(l) && !isEmpty(l)) {
			l = cursorArray[l].getNext();
			if (cursorArray[l].getData().equals(data))
				return l;
		}
		return -1; // not found
	}

	public int findPrevious(Object data, int l) {
		while (!isNull(l) && !isEmpty(l)) {
			if (cursorArray[cursorArray[l].getNext()].getData().equals(data))
				return l;
			l = cursorArray[l].getNext();
		}
		return -1; // not found
	}

	public Node deleteData(Object data, int l) {
		int p = findPrevious(data, l);
		if (p != -1) {
			int c = cursorArray[p].getNext();
			Node temp = cursorArray[c];
			cursorArray[p].setNext(temp.getNext());
			free(c);
		}
		return null;
	}

	public Node deleteFirst(int l) {
		int c = cursorArray[l].getNext(); // Implementation left as
		// an exercise
		Node toDel = cursorArray[c];
		if (!isNull(l) && !isEmpty(l)) {
			cursorArray[l].setNext(cursorArray[c].getNext());
		}
		return toDel;
	}

	public Node returnTop(int l) {
		if (!isNull(l) && !isEmpty(l))
			return cursorArray[cursorArray[l].getNext()];
		return null;
	}

	public void delete(int l) {
		while (!isEmpty(l)) {
			deleteFirst(l);
		}

	}

	public String toString() {
		String s = "i\tData\tNext\n";
		for (int i = 0; i < cursorArray.length; i++)
			s += i + "\t" + cursorArray[i] + "\n";
		return s;
	}
}
