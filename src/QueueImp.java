import java.util.Comparator;
import java.util.PriorityQueue;

//import Employee.empcomp;

public class QueueImp  implements Comparator<String>{
	
	int capacity;
	int currsize;
	int front;
	int rear;
	int arr[];
	
	QueueImp(int size)
	{
		this.capacity=size;
		this.front=0;
		this.rear=-1;
		this.arr=new int[capacity];
		this.currsize=0;
		
		
	}
	
	public void enqueue(int ele)
	{
		rear++;
		arr[rear]=ele;
		currsize++;
		System.out.println(ele+"inserted");
	}
	
	public int dequeue()
	{
		front++;
		if(front-1==capacity)
		{
			front=0;
		}
		int ele=arr[front-1];
		currsize--;
		System.out.println(ele+"removed");
		return ele;
	}
	
	class Employee
	{
		public Employee(int i) {
			// TODO Auto-generated constructor stub
		}
		String name;
		int age;
		int salary;
	}
	

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.length()-o2.length();
	}
		
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueImp obj=new QueueImp(3);
		obj.enqueue(1);
		obj.enqueue(2);
		obj.enqueue(3);
		obj.dequeue();
		obj.dequeue();
		obj.dequeue();
		
		//Queue que=new Queue();
		//Employee comp=new Employee(); 
		//comp.sorting
	empcomp comp=new empcomp();
		PriorityQueue<Employee> pr=new PriorityQueue<Employee>();
		//pr.add(200));
		//pr.add(new Employee(20));
		
//		System.out.println(pr.poll());
//		
//		Comparator ele=pr.comparator();
//		System.out.println(ele);
				//Employee emp=new Employee();
				
		//mycomparator com=new mycomparator();
		
		
		
	}

	

}
