public class lab2enqueuetest
{

	public static void main(String[] args) 
    {
		lab2enqueue obj = new lab2enqueue();
		obj.enqueue(1);
		obj.enqueue(4);
		obj.enqueue(3);
		obj.dequeue();
		assert(obj.isEmpty() == false);
		assert(obj.printFrontElement() == 3);
		assert(obj.len() == 2);
		System.out.println(obj.printFrontElement());
		
	}
}