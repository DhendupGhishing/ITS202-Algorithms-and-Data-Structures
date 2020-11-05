public class lab2test
{
public static void main(String []args)
{
queue obj=new queue(4);
obj.enqueue(10);
obj.enqueue(20);
obj.enqueue(30);
obj.enqueue(40);
System.out.println(obj.isEmpty());
System.out.println(obj.len());
System.out.println(obj.first());
System.out.println(+obj.dequeue());
System.out.println(obj.len());

}
}