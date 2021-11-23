import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HasMapDemo {
	
	static HashMap<String,Integer>  hash ;
	static
	{
		hash=new HashMap<>();
		hash.put("A", 100);
		hash.put("B", 200);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Map<Object, Object> streammap= Stream.of(new String[][]
//				{
//			{"Tom","A"},
//			{"Naveen","B"},
//				}).collect(Collectors.toMap(streammap[0], streammap[1]);
		
		
		Map<String,String> mapsig=Stream.of(new AbstractMap.SimpleEntry<>("Naveen","java"),
				(new AbstractMap.SimpleEntry<>("kiran", "python"))).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		System.out.println(mapsig.get("kiran"));
		
		//Map<String,String> immu=Stream.of(new AbstractMap.SimpleImmutableEntry<>("Naveen","java")).collect(Collectors.toMap(Map.Entry::getkey,Map.Entry::getvalue));
		Map<String,String> emptymap=Map.of();
		Map<String,String> singe=Map.of("sing", "ji");
	
		Map<String, Integer> mapsingle=Collections.singletonMap("test",1);
		System.out.println(mapsingle);
		//mapsingle.put("1", null);
		System.out.println(HasMapDemo.hash.get("A"));
		
		HashMap<Integer,String> mapdemo=new HashMap<Integer,String>();
		mapdemo.put(1, "Aksh");
		mapdemo.put(2,"Rosh");
		mapdemo.put(3, "you");
		mapdemo.put(4, "rest");
		
		Iterator<Integer> itr=mapdemo.keySet().iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	Iterator<String> it1=mapdemo.values().iterator();
	while(it1.hasNext())
	{
		System.out.println(it1.next());
	}
	mapdemo.forEach((k,v)->System.out.println("key:"+k + "value:"+v));
	System.out.println(mapdemo.get(1));
	System.out.println(mapdemo.get(2));
	
	Iterator<Entry<Integer,String>>it2=mapdemo.entrySet().iterator();
	while(it2.hasNext())
	{
		Entry<Integer,String>keyvalue=it2.next();
		System.out.println("key entry"+ keyvalue.getKey());
		System.out.println("value entry"+ keyvalue.getValue());
	}
	
	HashMap<Integer,String> map1=new HashMap<Integer,String>();
	map1.put(1, "A");
	map1.put(2,"B");
	map1.put(3, "C");
	map1.put(4, "C");
	
	HashMap<Integer,String> map2=new HashMap<Integer,String>();
	map2.put(1, "A");
	map2.put(2,"B");
	map2.put(3, "C");
	
	
	HashMap<String,String> map3=new HashMap<String,String>();
	map3.put("1", "A");
	map3.put("2","B");
	map3.put("3", "C");

	HashSet<Integer> hashset=new HashSet<>(map1.keySet());
	hashset.addAll(map2.keySet());
	System.out.println(hashset);
	hashset.removeAll(map2.keySet());
	System.out.println(hashset);
	
	System.out.println(map1.keySet().equals(map2.keySet()));
	System.out.println(map1.equals(map2));
	System.out.println(((map1.values()).equals(map2.values())));
	System.out.println(map1.values());
	System.out.println(map2.values());
	
System.out.println(new HashSet<>(map1.values()).equals(new HashSet<>(map2.values())));
System.out.println(new ArrayList<>(map1.values()).equals(new ArrayList<>(map2.values())));
	

//Synchronized Map
Map<Integer, String> syn=Collections.synchronizedMap(map1);
ConcurrentHashMap<String,String> con=new ConcurrentHashMap<>();
con.put("hi", "hi");

List<String> convert=new ArrayList<String>(map3.keySet());
convert.forEach(k->System.out.println(k));
	
	}
	


}
