package com.product;

public class LinkedList {
	private Node next;

	public LinkedList() {
		super();
		this.next = null;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public LinkedList insert(Product p) {
		Node node = new Node(p);
		LinkedList ll = new LinkedList();
		ll.setNext(node);

		return ll;
	}

}
