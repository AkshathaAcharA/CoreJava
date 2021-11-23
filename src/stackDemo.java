import java.util.Stack;

public class stackDemo {
	int size;
	int top;
	int arr[];
	
	Node head;
	
	stackDemo(int size)
	{
		this.size=size;
		this.arr=new int[size];
		this.top=-1;
		head=null;
	}
	
	public boolean isEmpty()
	{
		return top==-1;
	}
	
	
	public boolean isfull()
	{
		return (size-1==top);
	}
	
	public void push(int ele)
	{
		top++;
		arr[top]=ele;
	}
	
	public int pop()
	{
		int ele=top;
		top--;
		return ele;
	}
	
	public int peek()
	{
		return arr[top];
	}
	
	//Linked List Implementation
	class Node{
		int value;
		Node next;
	}
	
	public void pushLink(int value)
	{
		Node temphead=head;
		head=new Node();
		head.value=value;
		head.next=temphead;
	}
	
	public int poplink()
	{
		int value=head.value;
		head=head.next;
		return value;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Stack<Integer> demo=new Stack<Integer>();
     demo.push(1);
     demo.push(2);
     demo.push(3);
     demo.push(4);
     System.out.println(demo);
     demo.pop();
     demo.pop();
     System.out.println(demo);
     demo.peek();
     System.out.println(demo);
	}

}
