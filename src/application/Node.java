package application;

public class Node {
	private Object data;
	private int next;
	private Node nodenext;

	public Node(Object data, int next) {
		this.data = data;
		this.next = next;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public int getNext() {
		return next;
	}

	public void setNext(int next) {
		this.next = next;
	}

	public Node getNodenext() {
		return nodenext;
	}

	public void setNodenext(Node nodenext) {
		this.nodenext = nodenext;
	}

	@Override
	public String toString() {
		return "[" + data + " , " + next + "]";
	}

}
