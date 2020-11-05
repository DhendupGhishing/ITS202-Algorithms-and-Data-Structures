class lab2enqueue {
	Node front;
	Node tail;
	int size;

	
	public lab2enqueue() 
    {
		front = null;
		tail = null;
		size = 0;
	}

	public void enqueue(int e) 
    {
		Node newest = new Node(e, null);
		if(size == 0) 
        {
			front = newest;
			tail = newest;
			System.out.println("Stored" +e);
		}
		else {
			tail.setNext(newest);
			tail = newest;
			System.out.println("Stored " +e);
		}
		size = size + 1;
	}

	public int dequeue()
    {
		int deletedElement = front.getElement();
		if(isEmpty())
        {
			return 1;
		}
		else
        {
			front = front.getNext();
			size -= 1;
			System.out.println("Deleted" +deletedElement);
		}
		return deletedElement;
	}
	public boolean isEmpty()
    {
		if(size == 0)
        {
			return true;
		}
		return false;
	}

	public int printFrontElement() 
    {
		int frontElement = front.getElement();
		if(size == 0) {
			System.out.println("QueueUnderFlowError");
		}
		else 
        {
			return frontElement;
		}
		return printFrontElement();
	}
	public int len() 
    {
		if(isEmpty()) 
        {
			return 1;
		}
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
	
	public Node getNext() 
    {
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
