package application;

public class Stack {
	Cursor stack;
	int list;

	public Stack(int capacity) {
		stack = new Cursor(capacity);
		list = stack.createList();
	}

	// Adds a new element to the top of the stack
	public void push(Object data) {
		stack.insertAtHead(data, list);

	}

	// Removes and returns the stack's top element
	public Node pop() {
		return stack.deleteFirst(list);

	}

	// Return the top element without changing the stack
	public Node peek() {
		return stack.returnTop(list);
	}

	public boolean isEmpty() {
		return stack.isEmpty(list); // Returns if stack is empty
	}

	public void clear() {
		stack.delete(list);
	}

}
