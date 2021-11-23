import java.util.Comparator;
import java.util.Hashtable;
import java.util.Set;
import java.util.TreeMap;

public class Treemapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		TreeMap<Integer,String> map1=new TreeMap<>(Comparator.reverseOrder());
		map1.put(1000, "Tom");
		map1.put(200,"navee");
		map1.put(300, "akki");
		map1.forEach((k,v)->System.out.println(k+"value"+v));
		System.out.println(map1.lastKey());
		System.out.println(map1.firstKey());
		Set<Integer>great=map1.headMap(300).keySet();
       Set<Integer>small=map1.tailMap(200).keySet();
       System.out.println(map1.headMap(300).keySet());
       System.out.println(map1.tailMap(200).keySet());
       
       Hashtable<Integer,String> tab=new Hashtable<Integer,String>();
       
       tab.put(1000, "Tom");
       tab.put(200,"navee");
       tab.put(300, "akki");
       
       tab.forEach((k,v)->System.out.println(k+"value"+v));
	}

}
