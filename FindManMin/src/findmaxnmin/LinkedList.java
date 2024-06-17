package findmaxnmin;

public class LinkedList {
	private Node head;

	public LinkedList() {
		super();
		this.head = null;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public boolean insert(int data) {

		Node newNode = new Node(data);
		while (newNode == null) {
			return false;
		}

		if (head == null) {
			head = newNode;
			return true;
		}

		Node temp = head;
		if (head.getData() == data) {
			return false;
		}
		while (temp.getNext() != null) {
			temp = temp.getNext();
			if (temp.getData() == data) {
				return false;
			}
		}

		temp.setNext(newNode);
		return true;
	}

	public int max() {
		Node newnode = new Node();
		Node temp = head;

		while (newnode == null) {
			return -1;
		}
		if (temp.getNext() != null) {
			for(int i=0;;i++)
			
		}
		return temp.getData();
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
		System.out.println();
	}

}
