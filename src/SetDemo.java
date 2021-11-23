import java.util.HashSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(100);
		hs.add(200);
		hs.add(300);
		hs.add(500);
		
		hs.add(100);
		System.out.println(hs);
		HashSet<Integer> hs1=new HashSet<Integer>();
		hs1.add(100);
		hs1.add(1000);
		hs1.add(400);
		
		//hs.addAll(hs1);
		//hs.retainAll(hs1);
		hs.removeAll(hs1);
		System.out.println(hs);

	}

}
