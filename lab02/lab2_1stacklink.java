class  lab2_1stacklink{
	Node top;
	Node tail;
	int size;
    
	
	public lab2_1stacklink() {
		top = null;
		tail = null;
		size = 0;
	}

    
	public void push(int e) {
		Node newest = new Node(e, null);
		if(size == 0) {
			top = newest;
			tail = newest;
			System.out.println("Push " +e);
		}
		else {
			tail.setNext(newest);
			tail = newest;
			System.out.println("Push " +e);
		}
		size = size + 1;
	}

	public int pop() {
		int deletedElement = tail.getElement();
		if(isEmpty()) {
			return 1;
		}
		else {
			top = top.getNext();
			size -= 1;
			System.out.println("Pop : " +tail.getElement());
		}
		return deletedElement;
	}

 
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		return false;
	}
	
	public int size() {
		return size;
	}
}
class Node{
	
	private int element;
	private Node next;


	public Node(int element, Node next)
    {
		this.element = element;
		this.next = next;
	}

	public int getElement()
    {
		return element;
	}

	
	public Node getNext() {
		return next;
	}

	public void setElement(int e)
    {
		element = e;
	}

	public void setNext(Node e)
    {
		next = e;
	}
}
