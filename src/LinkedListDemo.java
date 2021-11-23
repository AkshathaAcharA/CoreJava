import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> linkeddemo=new LinkedList<String>();
		linkeddemo.add("A");
		linkeddemo.add("Z");
		linkeddemo.add("B");
		System.out.println(linkeddemo);
		Iterator itr=linkeddemo.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(linkeddemo);
		linkeddemo.addFirst("K");
		linkeddemo.addLast("L");
		System.out.println(linkeddemo);
		Collections.sort(linkeddemo);
		//linkeddemo.pee
		System.out.println(linkeddemo);
	}

}
