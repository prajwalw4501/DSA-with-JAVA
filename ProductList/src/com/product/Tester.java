package com.product;

public class Tester {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		LinkedList l2 = new LinkedList();
		Product p1 = new Product(1, "Parle-G", 12, 15);
		Product p2 = new Product(2, "chips", 20, 10);
		Product p3 = new Product(3, "jam", 100, 65);
		l2 = ll.insert(p1);
		l2 = ll.insert(p2);
		l2 = ll.insert(p3);
		while (l2.getNext() != null) {
			System.out.println(l2.getNext().toString());
			l2.setNext(l2.getNext());
			break;
		}
		System.out.println();

	}

}
