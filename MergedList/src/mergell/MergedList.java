package mergell;
//1.Java Program To Merge A Linked List Into Another Linked List At Alternate Positions

public class MergedList {
	Node head;

	public MergedList() {
		this.head = null;
	}

	public static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void push(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
		return;
	}

	public void show() {
		if (head == null) {
			System.out.println("List is Empty!!");
			return;
		}
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		return;
	}

	public void merge(MergedList ll) {
		Node temp1 = head;
		Node temp2 = ll.head;
		if (temp1 == null && temp2 == null) {
			System.out.println("List is Empty!!");
			return;
		}

		while (temp1 != null && temp2 != null) {
			Node next1 = temp1.next;
			Node next2 = temp2.next;
			temp1.next = temp2;
			temp2.next = next1;
			temp1 = next1;
			temp2 = next2;

		}
		ll.head = temp2;

	}

	public static void main(String[] args) {
		MergedList l1 = new MergedList();
		MergedList l2 = new MergedList();
		l1.push(1);
		l1.push(2);
		l1.push(3);
		l1.push(4);
		l1.show();
		System.out.println();
		l2.push(10);
		l2.push(20);
		l2.push(30);
		l2.push(40);
		l2.show();
		System.out.println();
		System.out.println("Merged List!!");
		l1.merge(l2);
		l1.show();

	}

}
