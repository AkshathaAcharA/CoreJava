import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.stream.Collectors;

public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       ArrayListDemo demoo=new ArrayListDemo();
//       demoo.start();
//       System.out.println(Thread.currentThread().getName());
//       ArrayListDemo demo=new ArrayListDemo();
//       demo.start();
//       System.out.println(Thread.currentThread().getName());
//       ArrayListDemo demo1=new ArrayListDemo();
//       demo1.start();
//       System.out.println(Thread.currentThread().getName());
		
		ArrayList<Integer> demo1= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		ArrayList<Integer> demo2= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,5));
		HashSet<Integer> dup=new HashSet<Integer>(demo2);
		
		System.out.println(dup);
		System.out.println(demo2.stream().distinct().collect(Collectors.toList()));
		//demo1.sort(null);
		Collections.sort(demo1);
		Collections.sort(demo2);
		System.out.println(demo1.equals(demo2));
		System.out.println(demo1.removeAll(demo2));
		System.out.println(demo1);
		demo1.retainAll(demo2);
		System.out.println(demo2);
		
		//demo2.ite
		//demo1.stream()
		
//		ArrayListDemo demo1=new ArrayListDemo();
//		demo1.start();
//		ArrayListDemo demo2=new ArrayListDemo();
//		demo2.start();
//		ArrayListDemo demo3=new ArrayListDemo();
//		demo3.start();
	}

}
