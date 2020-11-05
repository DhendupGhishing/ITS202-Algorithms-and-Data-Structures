public class lab2_1stacklinktest
{
	public static void main(String[] args)
    {
		lab2_1stacklink obj = new lab2_1stacklink();
		obj.push(4);
		obj.push(5);
		obj.push(6);
		obj.pop();
		assert(obj.isEmpty() == false);
		assert(obj.size() == 2);
		System.out.println(obj.isEmpty());
		System.out.println(obj.size());
		
	}
}