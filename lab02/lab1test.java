public class lab1test{
	public static void main(String[] args) {
		lab1 obj1=new lab1();
		obj1.push(2);
		obj1.push(7);
		obj1.push(2);
	
		System.out.println(obj1.pop());
		System.out.println(obj1.isEmpty());
		System.out.println(obj1.size());
		System.out.println(obj1.top());
		
	}
}